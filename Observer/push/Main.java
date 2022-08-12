package push;

public class Main {

	public static void main(String[] args) {
		ISubscriber s1 = new Subscriber_1();
		ISubscriber s2 = new Subscriber_1();
		ISubscriber s3 = new Subscriber_2();
	
		Publisher p = new Publisher();
		p.subscribe(s1);
		p.subscribe(s2);
		p.subscribe(s3);
		
		p.businessLogic();
		p.unsubscribe(s2);
		p.businessLogic();
	}

}
