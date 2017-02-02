package firstProject;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PopUp {

	public static void main(String[] args) {
		
		Scanner Name = new Scanner(System.in);
		System.out.println("Name a Celebrity");
		String celeb = Name.nextLine();
		String[] myOptions = {"Kill", "Marry","Date"};
		
		if (!celeb.equals("Josiah")){
		int answer = JOptionPane.showOptionDialog(null, "would you like to______" + celeb, "Lets play a game", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, myOptions, myOptions[2]);
		Name.close();
		//System.out.println(answer); //only needed if you want to check which result the PoPUp delivers
		if ( answer == 0){
			System.out.println("How Dare you Kill " + celeb);
			
		}
		else if (answer == 1){
			System.out.println("How Dare you Marry " + celeb);
		}
		
		else if (answer == 2){
			System.out.println("How Dare you Date " + celeb);
		}
		
		else {
			System.out.println("fuck you");
		}
	}
		else {
			System.out.println("C'mon");
		}
	}
		

}
