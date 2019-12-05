package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String model, String speed, String range, String price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadCargo() 
		{
			System.out.println("Loading Cargo... Beep Beep");
		}
		// TODO Auto-generated method stub

	

}
