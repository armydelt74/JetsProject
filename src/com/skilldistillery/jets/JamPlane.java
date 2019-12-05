package com.skilldistillery.jets;

public class JamPlane extends Jet implements JamCarrier {

	public JamPlane(String model, String speed, String range, String price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void jamType() {
		System.out.println( "Razzberry or Bluberry?" );
		// TODO Auto-generated method stub

	}

}
