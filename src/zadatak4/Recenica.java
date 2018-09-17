package zadatak4;

import java.util.Scanner;

public class Recenica {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite recenicu: ");
		String recenica = unos.nextLine();
		String[] rijeci = recenica.split(" ");
		if (rijeci.length > 1) {
			System.out.println(rijeci[rijeci.length - 2]);
		} else {
			System.out.println(rijeci[0]);
		}
		unos.close();
	}

}
