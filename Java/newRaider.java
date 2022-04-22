package newOregonTrail;

import java.util.Scanner;

public class newRaider {
	Scanner in = new Scanner(System.in);
	private int choice = -1;
	
	public int raiderOptions() {
        do {
        	System.out.println("1. Run\n2. Attack\n3. Surrender");
        	try {
    			choice = Integer.parseInt(in.nextLine());
    		}
    		catch(NumberFormatException e) {
    			System.out.print("Select a number 1-3. ");
    		}
        	if(!(choice >= 1 && choice <= 3))
        		System.out.println("Invalid input. Please try again.");
        }
        while(!(choice >= 1 && choice <= 3));
        return choice;
	}
}