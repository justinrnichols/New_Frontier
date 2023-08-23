package newOregonTrail;

import java.util.Scanner;

public class newHunting {
	newSupplies items = new newSupplies();
	newPuzzle funGame = new newPuzzle();
	Scanner in = new Scanner(System.in);
	private String[] animals = {"rabbit", "fox", "deer", "bear", "moose"};
	private int i = 0;
	
	public boolean encounteredDisplay() {
		String answer;
		boolean hunt = true;
		do {
			System.out.println("You encountered a " + animals[i] + "! Do you want to hunt for 10 bullets (y/n)?: ");
			answer = in.nextLine();
			if(!(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n")))
            	System.out.println("Invalid input. Please try again.");
		}
		while(!(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n")));
		if(answer.equalsIgnoreCase("n")) {
			System.out.println("Hunting trip was unsuccessful.");
			hunt = false;
		}
		if(answer.equalsIgnoreCase("y"))
			hunt = true;
		if(i == 5)
			i = 0;
		return hunt;
	}
	
	public void receiveFood() {
		items.setBullets(-10);
		System.out.println("You must pass the puzzle first to receive the caught food.");
		if(funGame.game() == true) {
			System.out.println("Hunting trip was successful!");
			if(i == 0)
				items.setFood(5);
			if(i == 1)
				items.setFood(10);
			if(i == 2)
				items.setFood(50);
			if(i == 3)
				items.setFood(100);
			if(i == 4)
				items.setFood(250);
		}
		else
			System.out.println("Hunting trip was unsuccessful.");
	}
	
	public boolean rabbit() {
		int rabbit;
		rabbit = (int) ((Math.random() * ((10 - 1) + 1)) + 1);
		if(rabbit % 2 == 0) {
			if(encounteredDisplay() == true)
				receiveFood();
		}
		else
			return false;
		return true;
	}
	
	public boolean fox() {
		int fox;
		fox = (int) ((Math.random() * ((20 - 1) + 1)) + 1);
		if(fox % 4 == 0) {
			if(encounteredDisplay() == true)
				receiveFood();
		}
		else
			return false;
		return true;
	}
	
	public boolean deer() {
		int deer;
		deer = (int) ((Math.random() * ((20 - 1) + 1)) + 1);
		if(deer % 5 == 0) {
			if(encounteredDisplay() == true)
				receiveFood();
		}
		else
			return false;
		return true;
	}
	
	public boolean bear() {
		int bear;
		bear = (int) ((Math.random() * ((100 - 1) + 1)) + 1);
		if(bear % 10 == 0) {
			if(encounteredDisplay() == true)
				receiveFood();
		}
		else
			return false;
		return true;
	}
	
	public boolean moose() {
		int moose;
		moose = (int) ((Math.random() * ((100 - 1) + 1)) + 1);
		if(moose % 20 == 0) {
			if(encounteredDisplay() == true)
				receiveFood();
		}
		else
			return false;
		return true;
	}
	
	public void noLuck() {
		if(rabbit() == false && fox() == false && deer() == false && bear() == false && moose() == false)
			System.out.println("Sorry no luck today hunting, try again.");
	}
	
	public void hunt() {
		if(items.getBullets() < 10) {
			System.out.println("Sorry you are out of bullets. Visit the store.");
			return;
		}
		rabbit();
		i++;
		if(items.getBullets() < 10) {
			System.out.println("Sorry you are out of bullets. Visit the store.");
			return;
		}
		fox();
		i++;
		if(items.getBullets() < 10) {
			System.out.println("Sorry you are out of bullets. Visit the store.");
			return;
		}
		deer();
		i++;
		if(items.getBullets() < 10) {
			System.out.println("Sorry you are out of bullets. Visit the store.");
			return;
		}
		bear();
		i++;
		if(items.getBullets() < 10) {
			System.out.println("Sorry you are out of bullets. Visit the store.");
			return;
		}
		moose();	
		i++;
	}
}