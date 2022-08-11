package primjer1.originator;

import primjer1.object.*;
import primjer1.memento.*;

public class Originator {
	private Auto auto;
	
	public Originator(Auto auto) {
		this.auto = auto;
	}
	
	public void setMemento(Memento memento) {
		auto = memento.getState();
	}
	
	public Memento createMemento() {
		return new Memento(auto);
	}
	
	public Auto getAuto() {
		return auto;
	}
	
	public void setAuto(Auto auto) {
		this.auto = auto;
	}
}
