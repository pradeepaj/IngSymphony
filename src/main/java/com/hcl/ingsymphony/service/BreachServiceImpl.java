
package com.hcl.ingsymphony.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ingsymphony.dto.BreachDTO;
import com.hcl.ingsymphony.dto.BreachRequestDTO;
import com.hcl.ingsymphony.dto.BreachResponsDTO;
import com.hcl.ingsymphony.entity.Breach;
import com.hcl.ingsymphony.entity.Rules;
import com.hcl.ingsymphony.repository.BreachRepository;
import com.hcl.ingsymphony.repository.RuleRepository;

@Service
public class BreachServiceImpl implements BreachServiceIntf{

	@Autowired
	BreachRepository breachRepository;
	@Autowired
	RuleRepository ruleRepository;

	
	@Override
	public BreachDTO resolveTickets(BreachDTO breachDTO) {
		
		Breach breach=	breachRepository.findById(breachDTO.getBreachId());
		breach.setStatus(breachDTO.getStatus());
		breachRepository.save(breach);
		BeanUtils.copyProperties(breach, breachDTO);
		return breachDTO;
	}


	@Override
	public BreachResponsDTO registerBreach(BreachRequestDTO breachRequestDTO) {
		
				BreachResponsDTO breachResponseDto = new BreachResponsDTO();
				Breach breach = new Breach();
				Rules rule = new Rules();
				BeanUtils.copyProperties(breachRequestDTO, breach);
				rule = ruleRepository.findByAreaNameAndCategoryName(breachRequestDTO.getBusinessArea(),breachRequestDTO.getBusinessCategory());
				if(rule != null) {
				breach.setSeverity(rule.getSeverity());	
		     	}
				
				breach = breachRepository.save(breach);
				BeanUtils.copyProperties(breach, breachResponseDto);
			
				return breachResponseDto;
			}
	
	
	
	}


