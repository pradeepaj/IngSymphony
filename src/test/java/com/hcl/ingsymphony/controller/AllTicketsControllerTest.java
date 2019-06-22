package com.hcl.ingsymphony.controller;

import java.util.ArrayList;
import java.util.List;

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
import com.hcl.ingsymphony.entity.Breach;
import com.hcl.ingsymphony.service.AllTicketsService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = AllTicketsController.class)
public class AllTicketsControllerTest {
	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private AllTicketsService allTicketService;

	@Test
	public void allTickets() throws Exception {
		Breach mockTicket = new Breach();
		mockTicket.setBusinessArea("abc");
		mockTicket.setBusinessCategory("Aclass");
		mockTicket.setDescription("Priority");
		
		mockTicket.setSeverity("High");
		mockTicket.setStatus("Approed");
		List<Breach> breachList=new ArrayList<>();
		breachList.add(mockTicket);
		
		
		
		Mockito.when(allTicketService.getAllTickets()).thenReturn(breachList);

		String URI = "/ingsymphony/allTickets";
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(URI).accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		String outputInJson = result.getResponse().getContentAsString();
		String inputInJson = this.mapToJson(breachList);
		Assert.assertEquals(outputInJson, inputInJson);

	}

	private String mapToJson(Object object) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(object);
	}
}