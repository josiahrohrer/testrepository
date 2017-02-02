package firstProject;

import java.util.Scanner;

public class Funktionen {

	public static void main(String[] args) {
		int resultatfunktion2 = funktion2();
		System.out.println(resultatfunktion2);
	}

	static int funktion(int eingabe1, int eingabe2) {

		int resultat = eingabe1 + eingabe2;

		return resultat;
	}

	static int funktion2() {
		Scanner myScanner = new Scanner(System.in);
		int zahl1 = myScanner.nextInt();
		int zahl2 = myScanner.nextInt();
		myScanner.close();
		int resultat = zahl1 + zahl2;
		return resultat;
	}
}
