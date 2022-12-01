package Zad_3_2019_20;

public class Main {

	public static void main(String[] args) {
		X x = new X();
		System.out.println(x.insert(new Roba(1L, "element inf", 0.55)));
		System.out.println(x.insert(new Roba(1L, "element inf", 0.55)));
		System.out.println(x.insert(new Roba(2L, "element 2", 2.55)));
		System.out.println(x.insert(new Roba(3L, "element 3", 3.55)));
		System.out.println(x.insert(new Roba(4L, "element 4", 4.55)));
		System.out.println(x.getById(1L));

		System.out.println(x.update(2L, new Roba(22L, "element 22", 22.55)));		
		System.out.println(x.insert(new Roba(2L, "element 2", 2.55)));
	}

}
