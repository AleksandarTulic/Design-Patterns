package push;

public class Subscriber_1 implements ISubscriber{

	@Override
	public void update(String state) {
		//voditi racuna da ovo moze biti npr sljedece
		//ako je state razlicito od SELECT ond aovde imamo neki atribut(ove klase koji je view) koji ce da update-uje prozore
		System.out.println("Subscriber1, Trenutno Stanje: " + state);
	}

}
