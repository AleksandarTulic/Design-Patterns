package primjer4.history;

import java.util.*;

public class CommandHistory {
	private Stack<String> q = new Stack<>();
	
	public void add(String value) {
		q.push(value);
	}
	
	public String remove() {
		return (String)q.pop();
	}
}
