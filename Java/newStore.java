package newOregonTrail;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class newStore {
	Scanner in = new Scanner(System.in);
	private static double money = 1000;
	private int answer;
	private String reply;
	
	newStore() {}
	
	public void playerInfo() throws FileNotFoundException, IOException {
    	try (BufferedReader reader = new BufferedReader(new FileReader("store_info.txt"))) {
 		   String line = null;
 		   while ((line = reader.readLine()) != null)
 		       System.out.println(line);
 		}
    }
	
	public double getMoney() {
		return money;
	}
	
	public void setMoney(double newMoney) {
		money = newMoney;
		if(money < 0)
			money = 0;
	}
	
	public boolean enterStore() {
		boolean enterStore = false;
		System.out.println("You have $" + money + " to spend.");
		do {
    		System.out.println("Would you like to enter the store (y/n)?: ");
    		reply = in.nextLine();
    		if(!(reply.equalsIgnoreCase("y") || reply.equalsIgnoreCase("n")))
            	System.out.println("Invalid input. Please try again.");
    	}
    	while(!(reply.equalsIgnoreCase("y") || reply.equalsIgnoreCase("n")));
    	if(reply.equalsIgnoreCase("n")) {
    		System.out.println("You just made a death wish by not going to the store. Good luck on your journey if you may.");
    	}
    	if(reply.equalsIgnoreCase("y"))
    		enterStore = true;
    	return enterStore;
	}
	
	public int integerCheck(int value) {
		try {
			value = Integer.parseInt(in.nextLine());
		}
		catch(NumberFormatException e) {
			System.out.print("Numbers only. ");
			value = -1;
		}
		return value;
	}
	
	public int howMany() {
		do {
			System.out.println("How many do you want to buy: ");
			answer = integerCheck(answer);
			if(answer < 0)
				System.out.println("Invalid input. Please try again.");
		}
		while(answer < 0 || answer == -1);
		return answer;
	}
	
	public int buyOx() {
		int ox = 0, totalOx = 0;
		System.out.println("It is $10 for one ox.");
		ox = howMany();
		for(int i = 0; i < ox; i++) {
			if(money >= 10) {
				money -= 10;
				totalOx += 1;
			}
			else {
				System.out.println("Sorry, money is low. You cannot purchase anymore oxen.");
				return totalOx;
			}
		}
		return totalOx;
	}
	
	public int buyFood() {
		int pounds = 0, totalFood = 0;
		System.out.println("It is $0.50 for one pound of food.");
		pounds = howMany();
		for(int i = 0; i < pounds; i++) {
			if(money >= 0.50) {
				money -= 0.50;
				totalFood += 1;
			}
			else {
				System.out.println("Sorry, money is low. You cannot purchase anymore food.");
				return totalFood;
			}
		}
		return totalFood;
	}
	
	public int buyBullets() {
		int boxes = 0, totalBullets = 0;
		System.out.println("It is $2 for one box of 10 bullets.");
		boxes = howMany();
		for(int i = 0; i < boxes; i++) {
			if(money >= 2) {
				money -= 2;
				totalBullets += 10;
			}
			else {
				System.out.println("Sorry, money is low. You cannot purchase anymore bullets.");
				return totalBullets;
			}
		}
		return totalBullets;
	}
	
	public int buyWagonParts() {
		int parts = 0, totalWagonParts = 0;
		System.out.println("It is $20 for one wagon part.");
		parts = howMany();
		for(int i = 0; i < parts; i++) {
			if(money >= 20) {
				money -= 20;
				totalWagonParts += 1;
			}
			else {
				System.out.println("Sorry, money is low. You cannot purchase anymore wagon parts.");
				return totalWagonParts;
			}
		}
		return totalWagonParts;
	}
	
	public int buyMedKits() {
		int kits = 0, totalMedKits = 0;
		System.out.println("It is $25 for one medical aid kit.");
		kits = howMany();
		for(int i = 0; i < kits; i++) {
			if(money >= 25) {
				money -= 25;
				totalMedKits += 1;
			}
			else {
				System.out.println("Sorry, money is low. You cannot purchase anymore medical aid kits.");
				return totalMedKits;
			}
		}
		return totalMedKits;
	}
}