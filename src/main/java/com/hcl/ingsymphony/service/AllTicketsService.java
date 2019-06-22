package com.hcl.ingsymphony.service;

import java.util.List;

import com.hcl.ingsymphony.entity.AllTickets;
import com.hcl.ingsymphony.entity.Breach;

public interface AllTicketsService {

	//AllTickets getAllTickets(Long employeeId);

	List<AllTickets> findAllHighTickets(String severity);

	//List<Breach> getAllTickets(int userId);

	List<Breach> getAllTickets();

}
