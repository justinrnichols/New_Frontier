package newOregonTrail;

import java.io.FileNotFoundException;
import java.io.IOException;

public class newOregonTrail {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		newGame run = new newGame();
	    newSupplies items = new newSupplies();
	    new newGame();
	    run.player();
	    run.date();
	    run.store();
	    items.statusUpdate();
	    run.playerTurn();
	}
}
