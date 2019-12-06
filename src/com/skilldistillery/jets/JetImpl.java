package com.skilldistillery.jets;

public class JetImpl extends Jet {

	public JetImpl(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		Double flightTime = (((this.getRange()/this.getSpeed())*60)*.75);
		System.out.println("U.F.O. " + (this.getModel()) + " at a cruising speed of " + (this.getSpeed()*.75) + " kph, has approximately " + (flightTime) + " minutes of flightTime remaining (estimated)" );
	}
}
