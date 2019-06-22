package com.hcl.ingsymphony.service;


import static org.mockito.Mockito.when;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.hcl.ingsymphony.entity.MyTicket;
import com.hcl.ingsymphony.repository.MyTicketRespository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTicketServiceTest {

	@InjectMocks
	private MyTicketServiceImp myTicketServiceImp;

	@Mock
	private MyTicketRespository myTicketRepository;

	@Test
	public void summaryDetails() {
		MyTicket myticket = new MyTicket();
		myticket.setEmployeeId(1L);
		when(myTicketRepository.findByEmployeeId(1L)).thenReturn(myticket);
		Assert.assertEquals(myticket, myTicketServiceImp.getMyTickets(1L));
	}

}