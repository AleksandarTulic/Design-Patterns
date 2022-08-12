package state;

import context.*;

public abstract class State {
	public abstract void moveUp(Player player);
	public abstract void moveDown(Player player);
}
