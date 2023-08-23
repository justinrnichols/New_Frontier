package newOregonTrail;

public class newSupplies {
	newDate calender = new newDate();
	newMiles distance = new newMiles();
	newStore buy = new 	newStore();
	private static int ox;
	private static int food;
	private static int bullets;
	private static int wagonParts;
	private static int medKits;
	
	newSupplies(){}
	
	public int getOx() {
		return ox;
	}
	
	public int getFood() {
		return food;
	}
	
	public int getBullets() {
		return bullets;
	}
	
	public int getWagonParts() {
		return wagonParts;
	}
	
	public int getMedKits() {
		return medKits;
	}
	
	public void setOx(int newOx) {
		ox += newOx;
		if(ox < 0)
			ox = 0;
	}
	
	public void setFood(int newFood) {
		food += newFood;
		if(food < 0)
			food = 0;
	}
	
	public void setBullets(int newBullets) {
		bullets += newBullets;
		if(bullets < 0)
			bullets = 0;
	}
	
	public void setWagonParts(int newWagonParts) {
		wagonParts += newWagonParts;
		if(wagonParts < 0)
			wagonParts = 0;
	}
	
	public void setMedKits(int newMedKits) {
		medKits += newMedKits;
		if(medKits < 0)
			medKits = 0;
	}
	
	public void suppliesStatus(int x) {
		
		if(buy.getMoney() == 1 && x == 0)
			System.out.println(buy.getMoney() + " total dollar");
		else if((buy.getMoney() == 0 || buy.getMoney() > 1) && x == 0)
			System.out.println(buy.getMoney() + " total dollars");
		if(ox == 1 && x == 1)
			System.out.println(ox + " total ox");
		else if((ox == 0 || ox > 1) && x == 1)
			System.out.println(ox + " total oxen");
		if(food == 1 && x == 2)
			System.out.println(food + " total pound of food");
		else if((food == 0 || food > 1) && x == 2)
			System.out.println(food + " total pounds of food");
		if(bullets == 1 && x == 3)
			System.out.println(bullets + " total bullet");
		else if((bullets == 0 || bullets > 1) && x == 3)
			System.out.println(bullets + " total bullets");
		if(wagonParts == 1 && x == 4)
			System.out.println(wagonParts + " total wagon parts");
		else if((wagonParts == 0 || wagonParts > 1) && x == 4)
			System.out.println(wagonParts + " total wagon parts");
		if(medKits == 1 && x == 5)
			System.out.println(medKits + " total medical aid kits");
		else if((medKits == 0 || wagonParts > 1) && x == 5)
			System.out.println(medKits + " total medical aid kits");
	}
	
	public void statusUpdate() {
		System.out.println("\n======Status Update======");
		System.out.println("Players alive: " + newGame.players);
		System.out.println("Current date is " + calender.getTime());
		System.out.println(distance.getMiles() + " total miles travelled");
		suppliesStatus(0);
		suppliesStatus(1);
		suppliesStatus(2);
		suppliesStatus(3);
		suppliesStatus(4);
		suppliesStatus(5);
	}
}