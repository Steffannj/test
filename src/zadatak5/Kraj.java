package zadatak5;

import java.util.ArrayList;
import java.util.Scanner;

public class Kraj {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite neke rijeci: ");
		ArrayList<String> listaRijeci = new ArrayList<>();
		String rijec = unos.next();
		while(!rijec.equals("kraj")) {
			listaRijeci.add(rijec);
			rijec = unos.next();
		}
		for(String s: listaRijeci) {
			System.out.print(s+" ");
		}
		
		unos.close();
	}

}
