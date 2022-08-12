package pull;

import java.util.*;

//subject
public class Publisher {
	private static Random rand = new Random();
	private List<Subscriber> arr = new ArrayList<>();
	private String state;
	
	public void subscribe(Subscriber sub) {	
		arr.add(sub);
	}
	
	public void unsubscribe(Subscriber sub) {
		arr.remove(sub);
	}
	
	public void notifySubscribers() {
		for (Subscriber i : arr) {
			i.update();
		}
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
