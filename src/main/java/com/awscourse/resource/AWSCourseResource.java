package com.awscourse.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.awscourse.entity.Machine;
import com.awscourse.service.MachineService;

@RestController
@RequestMapping
public class AWSCourseResource {
	@Autowired
	private MachineService machineService;
	
	// get basic 
	@GetMapping
	public ResponseEntity<Machine> getMachineInformation() {
		Machine machine = machineService.getMachineInformation();
		return ResponseEntity.ok(machine);
	}
}
