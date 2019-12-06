package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadCargo() {
		System.out.println(this.getModel() + " Loading Cargo... Beep Beep... Cargo loaded");
	}
	@Override
	public void fly() {
		Double flightTime = (((this.getRange()/this.getSpeed())*60)*.75);
		System.out.println("Cargo Plane " + (this.getModel()) + " at a cruising speed of " + (this.getSpeed()*.75) + " kph, has approximately " + (flightTime) + " minutes of flightTime remaining (estimated)" );

		
	}
	// TODO Auto-generated method stub

	// TODO Auto-generated method stub

}
