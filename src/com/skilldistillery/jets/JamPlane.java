package com.skilldistillery.jets;

public class JamPlane extends Jet implements JamCarrier {

	public JamPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void jamType() {
		System.out.println(this.getModel() + " fires Razzberry or Bluberry? Either way they've been Jammed!" );
	}
	@Override
	public void fly() {
		Double flightTime = (((this.getRange()/this.getSpeed())*60)*.75);
		System.out.println("Jammer Plane " + (this.getModel()) + " at a cruising speed of " + (this.getSpeed()*.75) + " kph, has approximately " + (flightTime) + " minutes of flightTime remaining (estimated)" );
	}
	
		// TODO Auto-generated method stub
		
	

}
