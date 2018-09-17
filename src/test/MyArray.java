package test;

import java.util.Scanner;


public class MyArray {
	int array[];

	MyArray(int array[]){
		
	}
	
	public int getSmallestElement(int array[]) {
		int smallest = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < smallest) {
				smallest = array[i];
			}
		}
		return smallest;
	}

	public int getLargestElement(int array[]) {
		int largest = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
		}
		return largest;
	}

	public int sumAllElements(int array[]) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	public void printAllElements() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite duzinu niza: ");
		int duzina = unos.nextInt();
		
		System.out.println("Unesite niz cijelih brojeva: ");
		int [] niz = new int[duzina];
		for(int i = 0; i < niz.length; i++) {
			niz[i] = unos.nextInt();
		}
		
		MyArray mojNiz = new MyArray(niz);
		
		System.out.println("Najmanji broj u nizu je: "+mojNiz.getSmallestElement(niz));
		System.out.println("Najveci broj u nizu je: "+mojNiz.getLargestElement(niz));
		System.out.println("Suma svih elemenata niza je: "+mojNiz.sumAllElements(niz));
		mojNiz.printAllElements();
		unos.close();
	}

}
