package com.hcl.ingsymphony.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ingsymphony.dto.LoginReqDTO;
import com.hcl.ingsymphony.dto.LoginResDTO;
import com.hcl.ingsymphony.entity.Breach;
import com.hcl.ingsymphony.entity.Role;
import com.hcl.ingsymphony.repository.BreachRepository;
import com.hcl.ingsymphony.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginRepository loginRepo;

	@Autowired
	BreachRepository breachRepo;

	@Override
	public List<LoginResDTO> validateLogin(LoginReqDTO userLoginDto) {

		Role role = loginRepo.findByUserIdAndRoleName(userLoginDto.getUserId(), userLoginDto.getRoleName());
		List<LoginResDTO> loginResList = new ArrayList<>();
		if (role != null) {

			List<Breach> breachList = breachRepo.findBySeverity(userLoginDto.getRoleName());
			for (Breach breach : breachList) {
				LoginResDTO loginRes = new LoginResDTO();
				BeanUtils.copyProperties(breach, loginRes);
				loginResList.add(loginRes);

			}

		}
		return loginResList;
	}

}