package context;

import state.*;

public class Player {
	private String name;
	private int strength;
	private State state;
	
	public Player() {
	}
	
	public Player(String name, State state) {
		super();
		this.name = name;
		this.strength = 3;
		this.state = state;
	}
	
	public Player(String name) {
		super();
		this.name = name;
		this.strength = 3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void moveUp() {
		state.moveUp(this);
	}
	
	public void moveDown() {
		state.moveDown(this);
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", strength=" + strength + "]";
	}
	
}
