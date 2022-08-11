package primjer1.caretaker;

import primjer1.memento.*;

public class Caretaker {
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}
	
	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
