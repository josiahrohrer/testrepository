package firstProject;

import java.util.Scanner;

public class PrimZahlen {

	public static void main(String[] args) {
		// ich möchte einen aloritmus entwerfen der eine mir Sagen kann ob eine
		// Zahl prim ist oder nicht
		int eingeleseneZahl = einlesen();
		// System.out.println(eingeleseneZahl);
		boolean isPrime = true;
		for (int teiler = 2; teiler < eingeleseneZahl && isPrime == true
				&& eingeleseneZahl > 0; teiler++) {
			int resultat = eingeleseneZahl % teiler;
			if (resultat == 0) {
				isPrime = false;
			}

		}
		if (isPrime == true && eingeleseneZahl > 0) {
			System.out.println("ist eine Primzahl");
		} else if (isPrime == false && eingeleseneZahl > 0) {
			System.out.println("ist keine Primzahl");
		} else if (isPrime == true && eingeleseneZahl == 0) {
			// hier darf nichts passieren
		} else if (isPrime == true && eingeleseneZahl < 0) {
			System.out.println("das ist eine negative Zahl");
		}
	}

	static int einlesen() {
		System.out.println("Bitte geben sie eine Zahl ein");
		Scanner myScanner = null;
		int eingabe = 0;
		try {
			myScanner = new Scanner(System.in);
			eingabe = myScanner.nextInt();
		} catch (Exception InputMismatchException) {
			System.out.println("das ist keine Zahl");
		}
		myScanner.close();
		return eingabe;
	}
}
