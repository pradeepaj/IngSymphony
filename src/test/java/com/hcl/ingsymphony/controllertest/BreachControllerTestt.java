package com.hcl.ingsymphony.controllertest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.ingsymphony.dto.BreachDTO;
import com.hcl.ingsymphony.service.BreachServiceImpl;
@RunWith(SpringRunner.class)

@SpringBootTest
@AutoConfigureMockMvc
public class BreachControllerTestt {
	@Autowired 
	MockMvc mockMvc;

	@MockBean
	BreachServiceImpl breachServiceImpl;
	@Autowired
    private WebApplicationContext wac;

	@Before
	public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();

	}
	@Test
	public void resolveTicketsTest() throws Exception{
		BreachDTO breachDTO=new BreachDTO();
		breachDTO.setBreachId(1);
		Mockito.when(breachServiceImpl.resolveTickets(breachDTO)).thenReturn(breachDTO);
		mockMvc.perform(
				MockMvcRequestBuilders.put("/ingsymphony/resolveTickets")
				.accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON)
				.content(mapToJson(breachDTO)))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}
	protected String mapToJson(Object obj) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(obj);
	}

}
