package com.hcl.ingsymphony.servicetest;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hcl.ingsymphony.dto.BreachDTO;
import com.hcl.ingsymphony.entity.Breach;
import com.hcl.ingsymphony.repository.BreachRepository;
import com.hcl.ingsymphony.service.BreachServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BreachServiceImplTest {
	@InjectMocks
	BreachServiceImpl breachServiceImpl;
	@Mock
	BreachRepository breachRepository;
	
	@Test
	public void resolveTicketsTest(){
		BreachDTO breachDTO=new BreachDTO();
		Breach breach=new Breach();
		breach.setBreachId(1);
		breach.setUserId(11);
		breach.setStatus("pending");
		when(breachRepository.findById(1)).thenReturn(breach);
		breach.setStatus("approved");
		BeanUtils.copyProperties(breach, breachDTO);
		Assert.assertEquals(breachDTO, breachServiceImpl.resolveTickets(breachDTO));
	}

}
