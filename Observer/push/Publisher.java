package push;

import java.util.*;

//subject
public class Publisher {
	private static Random rand = new Random();
	private List<ISubscriber> arr = new ArrayList<>();
	private String state;
	
	public void subscribe(ISubscriber sub) {	
		arr.add(sub);
	}
	
	public void unsubscribe(ISubscriber sub) {
		arr.remove(sub);
	}
	
	public void notifySubscribers() {
		for (ISubscriber i : arr) {
			i.update(state);
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
}
