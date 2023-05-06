package com.facadedesignpattern.computer.client;

import com.facadedesignpattern.computer.facade.ComputerFacade;
import com.facadedesignpattern.computer.subsystem.CPU;
import com.facadedesignpattern.computer.subsystem.HardDrive;
import com.facadedesignpattern.computer.subsystem.Memory;

public class MainClient {
	
	public static void main(String args[])
	{
		ComputerFacade computer = new ComputerFacade(new CPU(), new Memory(), new HardDrive());
		
		computer.start();
		
		computer.stop();
	}

}
