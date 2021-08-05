package com.phone;

public class IPhone extends Phone implements Ringable {
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	@Override
	public String ring() {
		String ring = getRingTone();
		return ring;
	}
	@Override
	public String unlock() {
		String unlock = "Unlocking via facial recognition";
		return unlock;
	}
	@Override
	public void displayInfo() {
		String versionNumber = getVersionNumber();
		String carrier = getCarrier();
		System.out.println("IPhone" + versionNumber + "from" + carrier );
	}
	
}
