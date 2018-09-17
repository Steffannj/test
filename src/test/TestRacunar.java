package test;

public class TestRacunar {

	public static void main(String[] args) {
		Racunar r = new Racunar(4, 300, 3.6, 20, 600);
		Laptop l = new Laptop(4, 400, 2.4, 16, 400, 6);
		
		System.out.println("Cijena racunara: "+r.izracunajCijenu());
		System.out.println("Cijena laptopa: "+l.izracunajCijenu());
	}

}
