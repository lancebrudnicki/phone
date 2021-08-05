package com.phone;

public class Galaxy extends Phone implements Ringable {
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}

	@Override
	public String ring() {
		String ring = getRingTone();
		return ring;
	}
	@Override
	public String unlock() {
		String unlock = "Unlocking via finger print";
		return unlock;
	}
	@Override
	public void displayInfo() {
		String versionNumber = getVersionNumber();
		String carrier = getCarrier();
		System.out.println("Galaxy" + versionNumber + "from" + carrier );
	}
	
	
}
