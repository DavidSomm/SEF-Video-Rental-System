package control;

import java.util.Scanner;

public class Menu {

	Scanner keyboard = new Scanner(System.in);
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Used to get an integer input from the user:
	public int getInt(String prompt, int min, int max) {
		int number = 0;
		
		System.out.print(prompt);
		
		do {
			try {
				number = keyboard.nextByte();
			}
			catch(Exception e) {
				number = -1;
			     keyboard.next();
			     System.out.println("Inputmust be between " + min + " - " + max + ".");
			}
		}while(number == -1 || number < min || number > max);
		
		return number;
	}
}//end of abstract class