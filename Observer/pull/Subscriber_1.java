package pull;

public class Subscriber_1 extends Subscriber{

	@Override
	public void update() {
		//voditi racuna da ovo moze biti npr sljedece
		//ako je state razlicito od SELECT ond aovde imamo neki atribut(ove klase koji je view) koji ce da update-uje prozore
		System.out.println("Subscriber1, Trenutno Stanje: " + super.publisher.getState());
	}

}
