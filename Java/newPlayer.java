package newOregonTrail;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class newPlayer {
	Scanner in = new Scanner(System.in);
    private String name;
    private int choice = -1;
    
    newPlayer(){}
    
    public void playerInfo() throws FileNotFoundException, IOException {
    	try (BufferedReader reader = new BufferedReader(new FileReader("player_info.txt"))) {
 		   String line = null;
 		   while ((line = reader.readLine()) != null)
 		       System.out.println(line);
 		}
    }
    
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
    
    public void enterNames() {
    	int i = 0;
    	while(i < 5) {
        	System.out.print((i + 1) + ". ");
            name = in.nextLine();
            setName(name);
            newGame.players.add(i, getName());
            i++;
        }
    	System.out.println(newGame.players + "\n");
    }
    
    public void reenterNames() {
    	boolean namesCorrect = false;
		while(namesCorrect == false) {
	        do {
	        	System.out.println("Are these name correct?\nIf no, type the number of the name you want to change. If yes, type 0.");
	        	try {
	    			choice = Integer.parseInt(in.nextLine());
	    		}
	    		catch(NumberFormatException e) {
	    			System.out.print("Select a number 1-5. ");
	    		}
	        	if(!(choice >= 0 && choice <= 5))
	        		System.out.println("Invalid input. Please try again.");
	        }
	        while(!(choice >= 0 && choice <= 5));
        	if(choice >= 1 && choice <= 5) {
        		System.out.print((choice) + ". ");
        		name = in.nextLine();
            	setName(name);
            	newGame.players.set(choice - 1, getName());
	            System.out.println(newGame.players + "\n");
        	}
            if(choice == 0) {
            	namesCorrect = true;
            	System.out.println("Players: " + newGame.players + "\n");
            }
	    }
    }
}