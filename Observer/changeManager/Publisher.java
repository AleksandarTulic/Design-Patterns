package changeManager;

import java.util.*;

public class Publisher {
	private Random rand = new Random();
	private ChangeManager changeManager;
	private String state;
	
	public Publisher(ChangeManager changeManager) {
		this.changeManager = changeManager;
	}
	
	public void subscribe(Subscriber sub) {	
		changeManager.subscribe(this, sub);
	}
	
	public void unsubscribe(Subscriber sub) {
		changeManager.unsuscribe(this, sub);
	}
	
	public void notifySubscribers() {
		changeManager.notifySubscribers(this);
	}
	
	public void businessLogic() {
		int value = rand.nextInt(4);
		
		if (value == 0)
			state = "SELECT";
		else if (value == 1)
			state = "DELETE";
		else if (value == 2)
			state = "UPDATE";
		else
			state = "INSERT";
		
		notifySubscribers();
	}
	
	public String getState() {
		return state;
	}
}
