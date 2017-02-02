package firstProject;

import java.util.Scanner;

public class SannerException {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter a number");
		try {
			int x = myScanner.nextInt();
			System.out.println("you entert the number " + x);
		} catch (Exception e) {
			System.out.println("that is not a number");
		};
		
		myScanner.close();
	}
static int funktion(int eingabe){
	
	return eingabe;
	
}
}
