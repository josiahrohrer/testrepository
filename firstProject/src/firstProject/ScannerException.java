package firstProject;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ScannerException {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		Scanner myScanner2 = new Scanner(System.in);
		Scanner myScanner3 = new Scanner(System.in);
		System.out.println("Enter 3 Celebrities in three differnet lines");
		int enter = myScanner.nextInt();
		String enter2 = myScanner2.nextLine();
		String enter3 = myScanner3.nextLine();
		System.out
				.println("You may now Selec what you want to do with this celebreties one after another");
		String[] Options = { "Shoot", "Marry", "Bang" };
		JOptionPane.showOptionDialog(null, "Would you like to _____ " + enter,
				"First Celebity", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, Options, null);
		JOptionPane.showOptionDialog(null, "Would you like to _____ " + enter2,
				"Second Celebity", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, Options, null);
		JOptionPane.showOptionDialog(null, "Would you like to _____ " + enter3,
				"Third Celebity", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, Options, null);

		myScanner.close();
		myScanner2.close();
		myScanner3.close();

	}

}
