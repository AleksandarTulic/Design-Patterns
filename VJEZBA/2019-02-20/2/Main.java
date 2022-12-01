package Zad_2_2019_2_20;

public class Main {

	public static void main(String[] args) {
		X x = new X();
		System.out.println(x.getById(5L));
		
		System.out.println(x.update(5L, new Roba(123L, "element inf", 0.55)));
		
		System.out.println(x.insert(new Roba(5L, "Element 5", 1023.1)));
	}

}
