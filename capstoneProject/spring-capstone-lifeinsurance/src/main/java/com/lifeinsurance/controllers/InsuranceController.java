package com.lifeinsurance.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lifeinsurance.model.Insurance;
import com.lifeinsurance.service.IInsuranceService;

@RestController
@RequestMapping("lifeinsurance-api")
public class InsuranceController {
	
	@Autowired
	IInsuranceService insuranceService;
	
	@PostMapping("/investments")
	public ResponseEntity<String> addInsurance(Insurance insurance) {
		insuranceService.addInsurance(insurance);
		return ResponseEntity.status(HttpStatus.CREATED).build();
		
	@PutMapping("/investments")
	public ResponseEntity<Void> updateInsurance(Insurance insurance){
		insuranceService.updateInsurance(insurance);
	}
		
	}

}
