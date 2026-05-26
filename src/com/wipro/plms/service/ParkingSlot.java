package com.wipro.plms.service;

public class ParkingSlot {
	private String slotId;
	private boolean occupied;
	private String vechicleNumber;
	
	public ParkingSlot(String slotId, boolean occupied, String vechicleNumber) {
		this.slotId = slotId;
		this.occupied = occupied;
		this.vechicleNumber = vechicleNumber;
	}

	public String getSlotId() {
		return slotId;
	}

	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public String getVechicleNumber() {
		return vechicleNumber;
	}

	public void setVechicleNumber(String vechicleNumber) {
		this.vechicleNumber = vechicleNumber;
	}

	@Override
	public String toString() {
		return "ParkingSlot [slotId=" + slotId + ", occupied=" + occupied + ", vechicleNumber=" + vechicleNumber + "]";
	}
	
	
	
}
