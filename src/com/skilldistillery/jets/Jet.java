package com.skilldistillery.jets;

public abstract class Jet {
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	private String model;
	private double speed;
	private int range;
	private long price;

	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public String toString() {
		String output = "model name=" + model + ", speed(kph)=" + speed + ", range=(km)" + range + ", price=$" + price;
		return output;
	}

	public void fly() {
	
	}

//		toString(); double flightTime; flightTime = range/speed;
//	 * System.out.println(flightTime); }
//	 * Integer.parseint (getJets.price)/(getJets.num)
//	 */

}
