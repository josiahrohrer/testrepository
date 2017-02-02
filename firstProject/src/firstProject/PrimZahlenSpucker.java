package firstProject;

import java.util.Scanner;

public class PrimZahlenSpucker {

	public static void main(String[] args) {
		System.out
				.println("Geben sie eine Zahl ein und ich gebe dir alle Prim Zahlen bis zu der Zahl aus");
		int input = einlesen();

		for (int allesbisEingabe = 2; allesbisEingabe <= input; allesbisEingabe++) {

			// hier erstelle ich alle Zahlen bis zu der Eingelesener
			boolean isPrime = true;
			for (int teiler = 2; teiler < allesbisEingabe && isPrime == true; teiler++) {
				if ((allesbisEingabe % teiler) == 0) {
					isPrime = false;
				}

			}
			if (isPrime == true) {
				System.out.println(allesbisEingabe);
			}

		}

	}

	static int einlesen() {
		Scanner myScanner = new Scanner(System.in);
		int a = myScanner.nextInt();
		myScanner.close();
		return a;
	}
}
