package com.hcl.ingsymphony.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ingsymphony.entity.Breach;
import com.hcl.ingsymphony.repository.MyTicketRespository;

@Service
public class MyTicketServiceImp implements MyTicketService {
	@Autowired
	private MyTicketRespository myTicketRepository;

	@Override
	public Breach getMyTickets(int userId) {
		return myTicketRepository.findByuserId(userId);

	}

}
