package com.skilldistillery.jets;

public abstract class Jet {
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	private String model;
	private String speed;
	private String range;
	private String price;
	
	public Jet(String model, String speed, String range, String price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	public String toString() {
	    String output = "model=" + model + ", speed=" + speed + ", range=" + range
	        + ", price=" + price;
	    return output;
	  }

	/*
	 * public void fly() { toString(); double flightTime; flightTime = range/speed;
	 * System.out.println(flightTime); }
	 * Integer.parseint (getJets.price)/(getJets.num)
	 */
	
	public void displayJet() {
	    String jetData = this.toString();
	    System.out.println(jetData);
}
}
