package com.hcl.ingsymphony.service;

import org.springframework.stereotype.Service;

import com.hcl.ingsymphony.entity.Breach;

@Service
public interface MyTicketService {

	Breach getMyTickets(int userId);

}
