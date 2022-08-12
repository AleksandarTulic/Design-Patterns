package push;

public class Subscriber_2 implements ISubscriber{

	@Override
	public void update(String state) {
		System.out.println("Subscriber2, Trenutno Stanje: " + state);
	}

}
