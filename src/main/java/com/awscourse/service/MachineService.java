package com.awscourse.service;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.stereotype.Service;

import com.awscourse.entity.DetailedMachine;
import com.awscourse.entity.Machine;

@Service
public class MachineService {

	// get machine information
	public Machine getMachineInformation() {

		try {
			InetAddress address = InetAddress.getLocalHost();
			String ip = address.getHostAddress();
			String name = address.getHostName();
			String os = System.getProperty("os.name");
			String arch = System.getProperty("os.arch");
			String osVersion = System.getProperty("os.version");

			Machine machine = new Machine(ip, name, os, arch, osVersion);

			return machine;
		} catch (UnknownHostException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	// get detailed machine information
	public DetailedMachine getDetailedMachineInformation() {

		try {
			InetAddress address = InetAddress.getLocalHost();
			String ip = address.getHostAddress();
			String name = address.getHostName();
			String os = System.getProperty("os.name");
			String arch = System.getProperty("os.arch");
			String osVersion = System.getProperty("os.version");
			String javaVersion = System.getProperty("java.version");
			String javaVendor = System.getProperty("java.vendor");
			String javaVendorUrl = System.getProperty("java.vendor.url");

			DetailedMachine detailedMachine = new DetailedMachine(ip, name, os, arch, osVersion, javaVersion,
					javaVendor, javaVendorUrl);

			return detailedMachine;
		} catch (UnknownHostException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}
