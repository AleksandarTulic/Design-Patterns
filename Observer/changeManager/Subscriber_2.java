package changeManager;

public class Subscriber_2 implements Subscriber{

	@Override
	public void update(Publisher p) {
		System.out.println("Subscriber2, Trenutno Stanje: " + p.getState());
	}

}
