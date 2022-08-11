package primjer3.originator;

import primjer3.object.*;

public class Originator {
	private Auto auto;
	
	public Originator(Auto auto) {
		this.auto = auto;
	}
	
	public void setMemento(Object memento) {
		auto = ((Memento)memento).auto;
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
	
	private class Memento{
		private final Auto auto;
		
		public Memento(Auto auto) {
			this.auto = auto;
		}
	}
}
