package com.hcl.ingsymphony.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ingsymphony.entity.Breach;
import com.hcl.ingsymphony.service.MyTicketService;

@RestController
@RequestMapping("/ingsymphony")
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class MyTicketsController {

	@Autowired
	private MyTicketService myTicketsService;

	@GetMapping("/myTickets/{userId}")
	public ResponseEntity<Breach> myTickets(@PathVariable int userId) {
		Breach myTicketResDto = myTicketsService.getMyTickets(userId);
		return new ResponseEntity<>(myTicketResDto, HttpStatus.OK);
	}
}
