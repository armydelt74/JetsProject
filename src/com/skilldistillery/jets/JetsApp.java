package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApp {

	private Scanner sc = new Scanner(System.in);

	private AirField af = new AirField();

	public static void main(String[] args) {
		JetsApp jetA = new JetsApp();
		jetA.run();

	}// main

	private void run() {
		try {
			boolean k = true;
			while (k) {
				displayUserMenu();
				System.out.println("Welcome to Terry Fold Airlines! Please select an option.");
				Integer userChoice = sc.nextInt();
				sc.nextLine();
				if (userChoice <= 0) {
					displayUserMenu();
				}
				if (userChoice == 1) {
					af.listFleet();
				}
				if (userChoice == 2) {
					af.flyAllJets();
				}
				if (userChoice == 3) {
					af.mostFast();
				}
				if (userChoice == 4) {
					af.farRange();
				}
				if (userChoice == 5) {
					af.loadAllCargoJets();
				}
				if (userChoice == 6) {
					af.loadAllJamJets();
				}
				if (userChoice == 7) {
					af.addJet();

				}
				if (userChoice == 8) {
					af.removeJet();
				}
				if (userChoice == 9) {
					k = false;
					System.out.println("Thanks for flying with Terry Fold Airlines!");
					break;
				}
			} // While
		} catch (Exception e) {
			System.out.println("Invalid Entry - please restart JetApp");
			;
			// TODO: handle exception

		} // catch

	}// run()

	private void displayUserMenu() {
		System.out.println("******************************************************");
		System.out.println("1 : List fleet ");
		System.out.println("2 : Fly all jets ");
		System.out.println("3 : View fastest jet ");
		System.out.println("4 : View jet with longest range");
		System.out.println("5 : Load all Cargo Jets ");
		System.out.println("6 : Dogfight! ");
		System.out.println("7 : Add a jet to Fleet ");
		System.out.println("8 : Remove a jet from Fleet ");
		System.out.println("9 : Quit ");
		System.out.println("*****************************************************");

	}

}// class
