package changeManager;

public class Subscriber_1 implements Subscriber{

	@Override
	public void update(Publisher p) {
		//voditi racuna da ovo moze biti npr sljedece
		//ako je state razlicito od SELECT ond aovde imamo neki atribut(ove klase koji je view) koji ce da update-uje prozore
		System.out.println("Subscriber1, Trenutno Stanje: " + p.getState());
	}

}
