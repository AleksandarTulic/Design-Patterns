package main;

import context.*;
import state.*;

public class Main {

	public static void main(String[] args) {
		Alive alive = new Alive();
		Player player = new Player("SuperMario", alive);
		
		player.moveUp();
		player.moveUp();
		player.moveDown();
		player.moveDown();
		player.moveDown();
		player.moveDown();
	}

}
