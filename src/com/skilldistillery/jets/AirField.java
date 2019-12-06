package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {
	
	public AirField() {
		super();
		fillField();
	}

	Scanner sc = new Scanner(System.in);
	private List<Jet> jets;
// class

	public void fillField() {
		jets = new ArrayList<Jet>();
		
		// setJets(new ArrayList<>());

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line = null;
			while ((line = bufIn.readLine()) != null) {
				String[] parts = line.split(",");

				Jet jetCreate = null;

				// System.out.println(line);
				if (parts[0].equals("Cargo")) {
					jetCreate = new CargoPlane(parts[1], Double.parseDouble(parts[2]), Integer.parseInt(parts[3]),
							Long.parseLong(parts[4]));
//					this.jets.add(new CargoPlane(parts[1], parts[2], parts[3], parts[4]));
				}
				if (parts[0].equals("Jam")) {
					jetCreate = new JamPlane(parts[1], Double.parseDouble(parts[2]), Integer.parseInt(parts[3]),
							Long.parseLong(parts[4]));
//					this.jets.add(new JamPlane(parts[1], parts[2], parts[3], parts[4]));

				} // if
				jets.add(jetCreate);
			} // while
		} catch (IOException e) {
			System.err.println(e);
		}
//	for (Jet jet : jets) {
//		System.out.println(jet.getClass().getSimpleName());
//	}

	}// ctor


	public void loadAllJamJets() {
		for (Jet jet : jets) {
			if (jet instanceof JamCarrier) {
				((JamCarrier) jet).jamType();
			}
		}
	}

	public void loadAllCargoJets() {
		for (Jet jet : jets) {
			if (jet instanceof CargoCarrier) {
				((CargoCarrier) jet).loadCargo();
			}

		}
	}

	public void flyAllJets() {
		for (Jet jet : jets) {
			jet.fly();
		}
	}

	public void listFleet() {
		for (Jet jet : jets) {
			System.out.println(jet);

		}
	}

	public void mostFast() {
		Jet fastestJet = null;
		double speedComp = 0.0;
		for (Jet jet : jets) {
			if (jet.getSpeed() > speedComp) {
				speedComp = jet.getSpeed();
				fastestJet = jet;
			}

		}
		System.out.println(fastestJet);
	}

	public void farRange() {
		Jet farthestJet = null;
		int rangeComp = 0;
		for (Jet jet : jets) {
			if (jet.getRange() > rangeComp) {
				rangeComp = jet.getRange();
				farthestJet = jet;
			}

		}
		System.out.println(farthestJet);
	}

	public void addJet() {
		Jet userJet = new CargoPlane("Tinman", 20000, 50000, 1);
		jets.add(userJet);
	}

	public void removeJet() {
		Jet removeJet = null;
		int i = 1;
		for (Jet jet : jets) {
			System.out.println(i + " . " + jet.getModel());
			i++;
		}
		System.out.println("Which jet would you like to remove?");
		int j = sc.nextInt();
		removeJet = jets.remove(j-1);
		System.out.println(removeJet);

	}
}// class
