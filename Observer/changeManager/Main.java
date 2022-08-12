package changeManager;

public class Main {

	public static void main(String[] args) {
		ChangeManager changeManager = new ChangeManager();
		Publisher p = new Publisher(changeManager);
		Subscriber s1 = new Subscriber_1();
		Subscriber s2 = new Subscriber_1();
		Subscriber s3 = new Subscriber_2();
		
		p.subscribe(s1);
		p.subscribe(s2);
		p.subscribe(s3);
		p.businessLogic();
		p.unsubscribe(s2);
		p.businessLogic();
	}

}
