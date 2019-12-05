package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {

	private List<Jet> jets;
// class
		
	
	public void fillField() {
		jets = new ArrayList<Jet>();
		//setJets(new ArrayList<>());

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line = null;
			while ((line = bufIn.readLine()) != null) {
				String[] parts = line.split(",");
				//System.out.println(line);
				if(parts[0].equals("Cargo")) {
				this.jets.add(new CargoPlane(parts[1], parts[2], parts[3], parts[4]));
			}
				if(parts[0].equals("Jam")) {
					this.jets.add(new JamPlane(parts[1], parts[2], parts[3], parts[4]));
				}//if
			}//while	
		} catch (IOException e) {
			System.err.println(e);
		}
System.out.println(jets);
	}//method

	public AirField() {
	super();
}

	public void loadAllCargoJets() {
	}

	public void loadAllJamJets() {

	}

}//class
