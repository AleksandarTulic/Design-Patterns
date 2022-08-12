package state;

import context.Player;

public class AliveType_01 extends State{

	@Override
	public void moveUp(Player player) {
		player.setState(new AliveType_02());
		player.setStrength(10);
		System.out.println("MoveUp - AliveType_02");
		System.out.println(player);
	}

	@Override
	public void moveDown(Player player) {
		player.setState(new Alive());
		player.setStrength(3);
		System.out.println("MoveDown - Alive");
		System.out.println(player);
	}

}
