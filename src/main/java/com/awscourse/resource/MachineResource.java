package com.awscourse.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.awscourse.entity.DetailedMachine;
import com.awscourse.entity.Machine;
import com.awscourse.service.MachineService;

@RestController
@RequestMapping(value = "machines")
public class MachineResource {
	
	@Autowired
	private MachineService machineService;
	
	// get basic machine
	@GetMapping("/basic")
	public ResponseEntity<Machine> getMachineInformation() {
		Machine machine = machineService.getMachineInformation();
		return ResponseEntity.ok(machine);
	}
	
	// get detailed machine
	@GetMapping("/detailed")
	public ResponseEntity<DetailedMachine> getDetailedMachineInformation() {
		DetailedMachine detailedMachine = machineService.getDetailedMachineInformation();
		return ResponseEntity.ok(detailedMachine);
	}
}
