package com.hcl.ingsymphony.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.ingsymphony.entity.MyTicket;
import com.hcl.ingsymphony.service.MyTicketService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = MyTicketsController.class)
public class MyTicketsControllerTest {
	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private MyTicketService myTicketService;

	@Test
	public void myTickets() throws Exception {
		MyTicket mockTicket = new MyTicket();
		mockTicket.setBusinessArea("abc");
		mockTicket.setBusinessCategory("Aclass");
		mockTicket.setDescription("Priority");
		mockTicket.setEmployeeId(123L);
		mockTicket.setSeverity("High");
		mockTicket.setStatus("Approed");

		Mockito.when(myTicketService.getMyTickets(Mockito.anyLong())).thenReturn(mockTicket);

		String URI = "/ingsymphony/myTickets/123";
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(URI).accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		String outputInJson = result.getResponse().getContentAsString();
		String inputInJson = this.mapToJson(mockTicket);
		Assert.assertEquals(outputInJson, inputInJson);

	}

	private String mapToJson(Object object) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(object);
	}

}