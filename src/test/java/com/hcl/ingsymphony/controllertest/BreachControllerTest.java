package com.hcl.ingsymphony.controllertest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.ingsymphony.controller.BreachController;
import com.hcl.ingsymphony.dto.BreachRequestDTO;
import com.hcl.ingsymphony.dto.BreachResponsDTO;
import com.hcl.ingsymphony.service.BreachServiceImpl;
import com.hcl.ingsymphony.service.BreachServiceIntf;
@RunWith(SpringRunner.class)
@WebMvcTest(value=BreachController.class)
public class BreachControllerTest {
	
	@Autowired 
	MockMvc mockMvc;
	
	@Mock
	@Autowired
	private BreachServiceIntf breachServiceIntf;

	@MockBean
	BreachServiceImpl breachServiceImpl;
	
	
	
	@Test
	public void registerStudentTest() throws Exception {
		BreachRequestDTO breachReqDto = new BreachRequestDTO();
		breachReqDto.setBusinessArea("retailbanking");
		breachReqDto.setBusinessCategory("debitcard");
		breachReqDto.setDescription("lost");
	
		
		BreachResponsDTO breachResDTO = new BreachResponsDTO();
		breachResDTO.setBusinessArea("retailbanking");
		breachResDTO.setBusinessCategory("debitcard");
		breachResDTO.setDescription("lost");
		mockMvc.perform(post("/ingsymphony/breach").contentType(MediaType.APPLICATION_JSON).content(asJsonString(breachResDTO)))
				.andExpect(status().isCreated());
		
}
	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	
	}}
	
	

