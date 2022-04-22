package newOregonTrail;

import java.util.ArrayList;
import java.util.Scanner;

public class newPuzzle {
	private ArrayList<String> displayNum = new ArrayList<>();
	
	public void printBoard() {
		System.out.println("\n|-----------|");
		System.out.println("| " + displayNum.get(0) + " | " + displayNum.get(1) + " | " + displayNum.get(2) + " |");
		System.out.println("|-----------|");
		System.out.println("| " + displayNum.get(3) + " | " + displayNum.get(4) + " | " + displayNum.get(5) + " |");
		System.out.println("|-----------|");
		System.out.println("| " + displayNum.get(6) + " | " + displayNum.get(7) + " | " + displayNum.get(8) + " |");
		System.out.println("|-----------|");
	}
	
	public boolean game() {
		Scanner in = new Scanner(System.in);
		displayNum.add(0, "1"); displayNum.add(1, "2"); displayNum.add(2, "3"); displayNum.add(3, "4"); displayNum.add(4, "5"); 
		displayNum.add(5, "6"); displayNum.add(6, "7"); displayNum.add(7, "8"); displayNum.add(8, "9"); 
		ArrayList<Integer> picks = new ArrayList<>();
		String [] tries = {"1st try: ", "2nd try: ", "3rd try: "};
		int rand, guess = 0, i = 0;
		rand = (int) ((Math.random() * ((9 - 1) + 1)) + 1);
		printBoard();
		System.out.println("You have 3 tries to guess the random number 1-9");
		while(i < 3) {
			System.out.print(tries[i]);
			do {
				guess = 0;
				try {
					guess = Integer.parseInt(in.nextLine());
				}
				catch(NumberFormatException e) {
					System.out.println("Numbers only. ");
				}
				if(picks.contains(guess)) {
					System.out.println("You already picked that number.");
					System.out.print(tries[i]);
				}
				if(!(guess >= 1 && guess <= 9)) {
					System.out.println("Invalid input. Please try again.");
					System.out.print(tries[i]);
				}
			}
			while(!(guess >= 1 && guess <= 9) || picks.contains(guess));
			picks.add(guess);
			displayNum.set(guess - 1, "X");
			printBoard();
			i++;
			if(guess == rand) {
				System.out.println("You won!");
				return true;
			}
			if(guess != rand && i == 3)
				System.out.println("You lose!");
			//System.out.println(picks);
		}
		return false;
	}
}