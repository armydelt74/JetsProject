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

	public void fillField() {
		jets = new ArrayList<Jet>();

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line = null;
			while ((line = bufIn.readLine()) != null) {
				String[] parts = line.split(",");

				Jet jetCreate = null;

				if (parts[0].equals("Cargo")) {
					jetCreate = new CargoPlane(parts[1], Double.parseDouble(parts[2]), Integer.parseInt(parts[3]),
							Long.parseLong(parts[4]));

				}
				if (parts[0].equals("Jam")) {
					jetCreate = new JamPlane(parts[1], Double.parseDouble(parts[2]), Integer.parseInt(parts[3]),
							Long.parseLong(parts[4]));
				}
				if (parts[0].equals("Alien")) {
					jetCreate = new JetImpl(parts[1], Double.parseDouble(parts[2]), Integer.parseInt(parts[3]),
							Long.parseLong(parts[4]));
				}

				jets.add(jetCreate);
			} // while
		} catch (IOException e) {
			System.err.println(e);
		}

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
		System.out.println("What would you call this plane?");
		String model = sc.next();
		System.out.println("How fast (kilometers/second) does it go?");
		double speed = sc.nextDouble();
		System.out.println("How far (kilometers) can you... I mean it... go?");
		int range = sc.nextInt();
		System.out.println("What are you worth... what would you pay?");
		long price = sc.nextLong();
		jets.add(new JetImpl(model, speed, range, price));
		System.out.println("It's your lucky day! An alien ship that absorbs compatible hosts descends... you are now a... plane... ship... thing!");
		
		
//		Jet userJet = new JetImpl("Tinman", 20000, 50000, 1);
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
		removeJet = jets.remove(j - 1);
		System.out.println(removeJet);

	}// removeJet()
}// class
