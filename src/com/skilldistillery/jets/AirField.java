package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {

	private List<Jet> jets;
	{
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jets = line.split("\t");
				System.out.println(line);
			}
	}catch(IOException e) {
		System.err.println(e);}
	}
// class

	public AirField() {
		setJets(new ArrayList<>());
	}

	public List<Jet> getJets() {
		return jets;
	}

	public void setJets(List<Jet> jets) {
		this.jets = jets;
	}

	public void loadAllCargoJets() {
	}

	public void loadAllJamJets() {

	}

}
