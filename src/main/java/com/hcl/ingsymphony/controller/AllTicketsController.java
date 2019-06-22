package com.hcl.ingsymphony.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ingsymphony.entity.AllTickets;
import com.hcl.ingsymphony.entity.Breach;
import com.hcl.ingsymphony.service.AllTicketsService;

@RestController
@RequestMapping("/ingsymphony")
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class AllTicketsController {
	@Autowired
	private AllTicketsService allTicketService;

	@GetMapping("/allTickets")
	public ResponseEntity<List<Breach>> allTickets() {
		List<Breach> allTicketsResDto = allTicketService.getAllTickets();
		return new ResponseEntity<>(allTicketsResDto, HttpStatus.OK);
	}

	@GetMapping("/all/{severity}")
	public ResponseEntity<List<AllTickets>> allTickets(@PathVariable String severity) {
		List<AllTickets> allTickets = allTicketService.findAllHighTickets(severity);
		return new ResponseEntity<>(allTickets, HttpStatus.OK);
	}
}
