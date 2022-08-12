package pull;

public class Main {

	public static void main(String[] args) {
		Subscriber s1 = new Subscriber_1();
		Subscriber s2 = new Subscriber_1();
		Subscriber s3 = new Subscriber_2();
	
		Publisher p = new Publisher();
		p.subscribe(s1);
		p.subscribe(s2);
		p.subscribe(s3);
		s1.setPublisher(p);
		s2.setPublisher(p);
		s3.setPublisher(p);
		
		p.businessLogic();
		p.unsubscribe(s2);
		p.businessLogic();
	}

}
