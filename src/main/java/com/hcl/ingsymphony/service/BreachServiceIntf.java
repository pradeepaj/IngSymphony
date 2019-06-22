package com.hcl.ingsymphony.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.hcl.ingsymphony.dto.BreachDTO;
import com.hcl.ingsymphony.dto.BreachRequestDTO;
import com.hcl.ingsymphony.dto.BreachResponsDTO;

public interface BreachServiceIntf {

	BreachResponsDTO registerBreach(BreachRequestDTO breachRequestDTO);
	public BreachDTO resolveTickets(@RequestBody BreachDTO breachDTO);

}
