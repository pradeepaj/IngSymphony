package com.hcl.ingsymphony.service;

import java.util.List;

import com.hcl.ingsymphony.dto.LoginReqDTO;
import com.hcl.ingsymphony.dto.LoginResDTO;
public interface LoginService {

	List<LoginResDTO> validateLogin(LoginReqDTO userLoginDto);

}