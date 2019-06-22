package com.hcl.ingsymphony.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.ingsymphony.entity.Breach;

@Repository
public interface MyTicketRespository extends JpaRepository<Breach, Integer> {

	Breach findByuserId(int userId);

}
