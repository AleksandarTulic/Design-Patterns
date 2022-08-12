package changeManager;

import java.util.*;

public class ChangeManager {
	private Map<Publisher, List<Subscriber>> map = new HashMap<Publisher, List<Subscriber>>();
	
	public void subscribe(Publisher p, Subscriber sub) {
		if (map.containsKey(p)) {
			map.get(p).add(sub);
		}else {
			List<Subscriber> arr = new ArrayList<>();
			arr.add(sub);
			map.put(p, arr);
		}
	}
	
	public void unsuscribe(Publisher p, Subscriber sub) {
		if (map.containsKey(p)) {
			map.get(p).remove(sub);
		}
	}
	
	public void notifySubscribers(Publisher p) {
		for (Subscriber i : map.get(p)) {
			i.update(p);
		}
	}
}
