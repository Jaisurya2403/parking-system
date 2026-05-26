package com.wipro.plms.service;

public class Services {
	private int VehicleNo;
	private String name;
	
	public int getVehicleNo() {
		return VehicleNo;
	}
	public void setVehicleNo(int vehicleNo) {
		VehicleNo = vehicleNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Services [VehicleNo=" + VehicleNo + ", name=" + name + "]";
	}
	
	
}
