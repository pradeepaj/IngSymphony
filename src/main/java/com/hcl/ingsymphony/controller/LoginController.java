package com.hcl.ingsymphony.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ingsymphony.dto.LoginReqDTO;
import com.hcl.ingsymphony.dto.LoginResDTO;
import com.hcl.ingsymphony.service.LoginService;

@RestController
@RequestMapping("/ingsymphony")
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class LoginController {
	private Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private LoginService loginService;

	@PostMapping("/login")
	public ResponseEntity<List<LoginResDTO>> validateLogin(@RequestBody LoginReqDTO userLoginDto) {
		logger.info("validateLogin");
		List<LoginResDTO> loginResDTO = loginService.validateLogin(userLoginDto);

		return new ResponseEntity<>(loginResDTO, HttpStatus.OK);
	}

}
