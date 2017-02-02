package firstProject;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BinaerRechner {

	public static void main(String[] args) {
		int Zahlensystem = 1;
		//PopUp();
		//System.out.println(Zahlensystem);
		if (Zahlensystem == 1){//dezimalsystem zu binär
		int eingabeD = einlesen();
		/*while (eingabeD > 0){
			//System.out.println(eingabeD);
			int a = eingabeD % 2;
			eingabeD = eingabeD / 2;
			System.out.println(a);
		}*/

		for (int a = 2 ; eingabeD > 0; eingabeD = eingabeD / a){
			int mod = eingabeD % a;
			System.out.print(mod);
		}
	}
		else if (Zahlensystem == 0){//binärsystem zu dezimal
		int eingabeB = einlesen(); 
		}
	}
	static int einlesen(){
		Scanner myScanner = new Scanner(System.in);
		int a = myScanner.nextInt();
		myScanner.close();
		return a;
	}	
	static int PopUp(){
		String myOptions[] = {"Binär", "Dezimal"};
		int a = JOptionPane.showOptionDialog(null, "in was für einem System möchten sie die Zahl eigeben?", "Zahlensystem", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, myOptions, null);
		return a;
	}
}

