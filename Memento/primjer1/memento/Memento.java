package primjer1.memento;

import primjer1.object.*;

public class Memento {
	private Auto auto;
	
	public Memento() {
	}
	
	public Memento(Auto auto) {
		this.auto = auto;
	}
	
	public void setState(Auto auto) {
		this.auto = auto;
	}
	
	public Auto getState() {
		return auto;
	}
}
