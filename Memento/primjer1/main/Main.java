package primjer1.main;

import primjer1.originator.*;
import primjer1.caretaker.*;
import primjer1.object.*;

public class Main {

	public static void main(String[] args) {
		Originator o = new Originator(new Auto("BMW", "X3", 29999.99));
		System.out.println(o.getAuto());
		
		Caretaker c = new Caretaker();
		c.setMemento(o.createMemento());
		
		o.setAuto(new Auto("BMW", "X5", 61999.97));
		System.out.println(o.getAuto());
		
		o.setMemento(c.getMemento());
		System.out.println(o.getAuto());
	}

}
