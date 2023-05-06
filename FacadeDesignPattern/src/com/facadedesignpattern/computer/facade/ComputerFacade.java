package com.facadedesignpattern.computer.facade;

import com.facadedesignpattern.computer.subsystem.CPU;
import com.facadedesignpattern.computer.subsystem.HardDrive;
import com.facadedesignpattern.computer.subsystem.Memory;

public class ComputerFacade {
	
	private CPU cpu;
	private Memory memory;
	private HardDrive  hardrive;
	public ComputerFacade(CPU cpu, Memory memory, HardDrive hardrive) {
		super();
		this.cpu = cpu;
		this.memory = memory;
		this.hardrive = hardrive;
	}
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public Memory getMemory() {
		return memory;
	}
	public void setMemory(Memory memory) {
		this.memory = memory;
	}
	public HardDrive getHardrive() {
		return hardrive;
	}
	public void setHardrive(HardDrive hardrive) {
		this.hardrive = hardrive;
	}
	
	
	
	public void start()
	{
		System.out.println("Starting the computer ");
		
		cpu.processData();
		memory.load();
		hardrive.readData();
		
	}
	
	public void stop()
	{
		System.out.println("Stopping the stop");
		

		cpu.processData();
		memory.load();
		hardrive.readData();
	}
	

}
