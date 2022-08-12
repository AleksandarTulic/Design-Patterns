package state;

import context.Player;

public class AliveType_02 extends State{

	@Override
	public void moveUp(Player player) {
	}

	@Override
	public void moveDown(Player player) {
		player.setState(new AliveType_01());
		player.setStrength(5);
		System.out.println("MoveDown - AliveType_01");
		System.out.println(player);
	}

}
