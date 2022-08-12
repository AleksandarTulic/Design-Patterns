package pull;

public class Subscriber_2 extends Subscriber{

	@Override
	public void update() {
		System.out.println("Subscriber2, Trenutno Stanje: " + super.publisher.getState());
	}

}
