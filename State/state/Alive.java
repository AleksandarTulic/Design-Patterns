package state;

import context.*;

public class Alive extends State{
	
	@Override
	public void moveUp(Player player) {
		player.setState(new AliveType_01());
		player.setStrength(5);
		System.out.println("MoveUp - AliveType_01");
		System.out.println(player);
	}

	@Override
	public void moveDown(Player player) {
		player.setState(new Dead());
		player.setStrength(0);
		System.out.println("MoveDown - Dead");
		System.out.println(player);
	}

}
