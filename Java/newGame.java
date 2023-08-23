package newOregonTrail;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class newGame {
	
	JFrame window;
	Container con;
	JPanel titleNamePanel, startButtonPanel;
	JLabel titleNameLabel;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 70);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);
	JButton startButton;
	
	public newGame() {
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();
		
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 100, 600, 150);
		titleNamePanel.setBackground(Color.black);
		titleNameLabel = new JLabel("NEW FRONTIER");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(Color.black);
		
		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.DARK_GRAY);
//		startButton.setOpaque(true);
//		startButton.setBorderPainted(false);
		startButton.setFont(normalFont);
		
		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);
		
		con.add(titleNamePanel);
		con.add(startButtonPanel); 
	}
	
	public static ArrayList<String> players = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    newDate calender = new newDate();
    newStore buy = new newStore();
    newSupplies items = new newSupplies();
    newMiles distance = new newMiles();
    newHunting shoot = new newHunting();
    
    public void pressEnterToContinue() { 
       System.out.println("Press Enter key to continue.");
       try{
           System.in.read();
       }  
       catch(Exception e)
       {}  
    }
    
    public ArrayList<String> player() throws FileNotFoundException, IOException {
    	newPlayer person = new newPlayer();
    	System.out.println("THE NEW FRONTIER\n");
    	pressEnterToContinue();
        person.playerInfo();
        pressEnterToContinue();
        System.out.println("Enter the names of your 5 family members: ");
        person.enterNames();
	    person.reenterNames();
        return players;
    }
    
    public void date() throws FileNotFoundException, IOException {
    	newDate calender = new newDate();
    	pressEnterToContinue();
    	String answer;
    	calender.dateInfo();
    	pressEnterToContinue();
    	do {
    		System.out.println("When would you like to leave?\nThe default departure date is 28 March 1847.\nWould you like to change it (y/n)?: ");
    		answer = in.nextLine();
    		if(!(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n")))
            	System.out.println("Invalid input. Please try again.");
    	}
    	while(!(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n")));
    	if(answer.equalsIgnoreCase("n")) {
    		calender.defaultMonth();
    		calender.defaultDay();
    		System.out.println("Departure date: " + calender.getTime() + "\n");
    	}
    	if(answer.equalsIgnoreCase("y")) {
    		do {	
    				calender.enterMonth();
    				calender.enterDay();
    				do {
	    				System.out.println("Departure date: " + calender.getTime() + "\nIs the date correct (y/n): ");
	    				answer = in.nextLine();
	    				if(answer.equalsIgnoreCase("y"))
	    					System.out.println("Great! Let's move on.\n");
	    				if(!(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n")))
	    	            	System.out.println("Invalid input. Please try again.");
    				}
    				while(!(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n")));
    		}
    		while(answer.equalsIgnoreCase("n"));
    	}
    	pressEnterToContinue();
    	buy.playerInfo();
    	pressEnterToContinue();
    }  
    
    public void store() throws FileNotFoundException, IOException {
    	newDisplay show = new newDisplay();
    	int choice = 0;
    	boolean enter;
    	if(buy.getMoney() <= 0) {
    		buy.setMoney(0);
    		System.out.println(buy.getMoney());
    		System.out.println("Sorry, money is low. You cannot purchase anything else.");
    		return;
    	}
    	enter = buy.enterStore();
    	while(enter == true) {
    		int ox = 0, food = 0, bullets = 0, wagonParts = 0, medKits = 0;
    		show.storeDisplay();
    		try {
    			choice = Integer.parseInt(in.nextLine());
    		}
    		catch(NumberFormatException e) {
    			System.out.print("Numbers only. ");
    		}
    		if(buy.getMoney() > 0) {
    			switch(choice) {
    				case 1:
	    				System.out.println("\nThe store owner recommends to buy oxen to move your wagon.");
	    	    		ox += buy.buyOx();
	    	    		items.setOx(ox);
	    	    		System.out.println("You bought " + ox + " ox(en).");
	    	    		System.out.println("Total money left: $" + buy.getMoney());
		    			break;
    				case 2:
	    				System.out.println("\nThe store owner recommends to buy food to not starve.");
	    				food += buy.buyFood();
	    				items.setFood(food);
	    				System.out.println("You bought " + food + " pound(s) of food.");
	    	    		System.out.println("Total money left: $" + buy.getMoney());
    					break;
    				case 3:
	    	    		System.out.println("\nThe store owner recommends to buy bullets to fight off attackers or to hunt.");
	    	    		bullets += buy.buyBullets();
	    	    		items.setBullets(bullets);
	    	    		System.out.println("You bought " + bullets + " bullets.");
	    	    		System.out.println("Total money left: $" + buy.getMoney());
    					break;
    				case 4:
	    	    		System.out.println("\nThe store owner recommends to buy wagon parts to repair broken parts.");
	    	    		wagonParts += buy.buyWagonParts();
	    	    		items.setWagonParts(wagonParts);
	    	    		System.out.println("You bought " + wagonParts + " wagon part(s).");
	    	    		System.out.println("Total money left: $ " + buy.getMoney());
		    	    	break;
    				case 5:
	    	    		System.out.println("\nThe store owner recommends to buy medical aid kits to stay healthy.");
	    	    		medKits += buy.buyMedKits();
	    	    		items.setMedKits(medKits);
	    	    		System.out.println("You bought " + medKits + " medical aid kits(s).");
	    	    		System.out.println("Total money left: $" + buy.getMoney());
		    	    	break;
    				case 6:
    					System.out.println("Thanks for shopping!");
    					return;
    				default:
    					System.out.println("Invalid input. Please try again.");
    					break;
    			}
    		}
    		else {
    			System.out.println("Sorry, money is low. You cannot purchase anything else.");
    			return;
    		}
    	}
    }
    
	public void failedGameCheck() {
    	if(calender.getMonth() >= 12) {
    		System.out.println("Sorry, it is past 30 Novemeber 1847 and you died of the winter cold!\nYou failed the game.");
    		System.exit(0);
    	}
    	if(items.getFood() <= 0) {
    		System.out.println("Sorry, you are out of food and died of starvation!\nYou failed the game.");
    		System.exit(0);
    	}
    	if(items.getOx() <= 0) {
    		System.out.println("Sorry, all your ox have died and your wagon cannot move!\nYou failed the game.");
    		System.exit(0);
    	}
    	if(players.size() == 0) {
    		System.out.println("Sorry, everyone has died!\nYou failed the game.");
    		System.exit(0);
    	}
		if(items.getWagonParts() <= 0) {
			System.out.println("Oh no! You ran out of wagon parts and are unable to continue the journey!\nYou failed the game.");
			System.exit(0);
		}
    }
    
    public void continueOn() {
    	int randDistance;
    	randDistance = (int) ((Math.random() * ((150 - 80) + 1)) + 80);
    	items.setFood(-2 * players.size() * 14);
    	distance.setMiles(randDistance);
    	calender.setDay(14);
    	failedGameCheck();
    	System.out.println("You travelled " + randDistance + " miles in 14 days and ate " + (2 * players.size() * 14) + " pounds of food.");
    }
    
    public void resting() {
    	int randRest;
    	randRest = (int) ((Math.random() * ((3 - 1) + 1)) + 1);
    	items.setFood(-1 * players.size() * randRest);
    	calender.setDay(randRest);
    	failedGameCheck();
    	if(randRest == 1)
    		System.out.println("You rested for " + randRest +  " day and ate " + (1 * players.size() * randRest) + " pounds of food.");
    	if(randRest == 2 || randRest == 3)
    		System.out.println("You rested for " + randRest +  " days and ate " + (1 * players.size() * randRest) + " pounds of food.");
    }
    
    public void misfortunes() {
    	String[] disease = {"typhoid", "cholera", "diarrhea", " measles", "dysentery", "a fever"};
    	String[] wagonPart =  {"wagon wheels", "axles", "tongues"};
    	int randMisfortune, typeOfMisfortune, diseasedPlayer, typeOfDisease, medicalDeath, typeOfWagonPart;
    	randMisfortune = (int) ((Math.random() * ((30 - 1) + 1)) + 1);
    	if(randMisfortune % 3 == 0) {
    		typeOfMisfortune = (int) ((Math.random() * ((5 - 1) + 1)) + 1);
    		if(typeOfMisfortune == 1) {
    			diseasedPlayer = (int) ((Math.random() * ((players.size() - 0) + 0)) + 0);
    			typeOfDisease = (int) ((Math.random() * ((6 - 1) + 1)) + 1);
    			System.out.println("Oh no! " + players.get(diseasedPlayer) + " has " + disease[typeOfDisease - 1] + "!");
    			if(items.getMedKits() > 0) {
    				items.setMedKits(-1);
    				System.out.println("There is a chance of death, but you have a medical kit to better the odds.\n");
    				medicalDeath = (int) ((Math.random() * ((20 - 1) + 1)) + 1);
    				pressEnterToContinue();
    				if(medicalDeath % 4 == 0) {
    					players.remove(diseasedPlayer);
    					System.out.println("Oh no! " + players.get(diseasedPlayer) + " died from " + disease[typeOfDisease - 1] + "!");
    					failedGameCheck();
    				}
    				else 
    					System.out.println("Bless! " + players.get(diseasedPlayer) + " survived " + disease[typeOfDisease - 1] + "!");
    			}
    			if(items.getMedKits() <= 0) {
    				System.out.println("There is a chance of survival, but you do not have a medical kit to better the odds.\n");
    				medicalDeath = (int) ((Math.random() * ((20 - 1) + 1)) + 1);
    				pressEnterToContinue();
    				if(medicalDeath % 4 == 0)
    					System.out.println("Bless! " + players.get(diseasedPlayer) + " survived " + disease[typeOfDisease - 1] + "!");
    				else {
    					players.remove(diseasedPlayer);
    					System.out.println("Oh no! " + players.get(diseasedPlayer) + " died from " + disease[typeOfDisease - 1] + "!");
    					failedGameCheck();
    				}	
    			}
    		}
    		if(typeOfMisfortune == 2) {
    			System.out.println("Oh no! One of your ox died!");
    			items.setOx(-1);
    			failedGameCheck();
    		}
    		if(typeOfMisfortune == 3) {
    			typeOfWagonPart = (int) ((Math.random() * ((3 - 1) + 1)) + 1);
    			System.out.println("Oh no! One of your " + wagonPart[typeOfWagonPart - 1] + " on the wagon broke!");
    			failedGameCheck();
    			if(items.getWagonParts() > 0) {
    				items.setWagonParts(-1);
    				System.out.println("Luckily, you had a spare wagon part to fix it!");
    			}
    		}
    		if(typeOfMisfortune == 4) {
    			buy.setMoney(buy.getMoney() + 500);
    			System.out.println("You discovered a lost pirate treasure chest. Your cash reserves increase by 500 dollars!");
    		}
    	}
    }
    
    public void raiderAttack() {
    	newRaider attack = new newRaider();
    	newPuzzle funGame = new newPuzzle();
    	double raiderProbability;
    	int randRaider, decision;
    	raiderProbability = Math.pow(1,2);
    	raiderProbability = ((((Math.pow((distance.getMiles() / 100) - 4, 2) + 72) / (Math.pow((distance.getMiles() / 100) - 4, 2) + 12)) - 1) / 10) * 100;
    	randRaider = (int) ((Math.random() * ((100 - 1) + 1)) + 1);
    	if(randRaider <= raiderProbability) {
    		System.out.println("Raiders ahead! They look hostile! You must make a decision.");
    		decision = attack.raiderOptions();
    		if(decision == 1) {
    			items.setOx(-1);
    			items.setFood(-25);
    			items.setWagonParts(-1);
    			System.out.println("Oh no! You lost an ox, 25 pounds of food, and a wagon part while trying to escape.");
    			failedGameCheck();
    		}
    		if(decision == 2) {
    			if(funGame.game() == true) {
    				items.setFood(100);
    				items.setBullets(50);
    				System.out.println("You won the battle! You gained 100 pounds of food and 50 bullets.");
    			}
    			else {
    				if(buy.getMoney() <= 50)
    					System.out.println("They stole the rest of your money.");
    				if(items.getBullets() <= 50)
    					System.out.println("You used the rest of your bullets fighting them.");
    				buy.setMoney(buy.getMoney() -50);
    				items.setBullets(-50);
    				System.out.println("You lost the battle! They stole $50 and you used 50 bullets fighting them.");
    			}
    		}
    		if(decision == 3) {
    			System.out.println("You surrended to the attack! They got away with $100 dollars.");
    			if(buy.getMoney() < 100)
					System.out.println("They stole the rest of your money.");
    			buy.setMoney(buy.getMoney() - 100);
    		}
    	}
    }
    
    public void wonGame() throws IOException {
    	System.out.println("Congratulations! You have made it to Oregon City, Oregon before the start of the harsh winter of 1847."
    			+ "\nHere are your final results.");
    	items.statusUpdate();   
    	System.exit(0);
    }   
    
    public void playerTurn() throws IOException {
//    	players.add(0, "Jim"); players.add(1, "fds"); players.add(2, "fda"); players.add(3, "few"); players.add(4, "ggg");
//    	items.setFood(1000);
//    	items.setOx(9);
//    	items.setBullets(50);
//    	items.setWagonParts(5);
//    	items.setMedKits(5);
    	newDisplay show = new newDisplay();
    	String answer;
    	int choice = 0;
		while(true) {
			show.mainDisplay();
			try {
				choice = Integer.parseInt(in.nextLine());
			}
			catch(NumberFormatException e) {
				System.out.print("Numbers only. ");
			}
			if(distance.getMiles() >= 2040 && calender.getMonth() < 12)
				wonGame();
			failedGameCheck();
			switch(choice) {
				case 1:
					continueOn();
					misfortunes();
					raiderAttack();
					break;
				case 2: 
					resting();
					misfortunes();
					raiderAttack();
					break;
				case 3: 
					shoot.hunt();
					break;
				case 4: 
					items.statusUpdate();
					break;
				case 5:
					store();
					break;
				case 6:
					do {
						System.out.println("Are you sure you want to quit the game (y/n)?: ");
			    		answer = in.nextLine();
			    		if(!(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n")))
			            	System.out.println("Invalid input. Please try again.");
			    	}
			    	while(!(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n")));
					if(answer.equalsIgnoreCase("n"))
						System.out.println("Good choice!");
					if(answer.equalsIgnoreCase("y")) {
						System.out.println("Sorry you had to cut your trip short.\nYou failed the game.");
						System.exit(0);
					}
					break;
				default: 
					System.out.println("Invalid input. Please try again.");
					break;
			}	
    	}
    }
}