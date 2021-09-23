package com.bridgelabz.Generics_Day13.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Maximum {

	public void findMax() {
		ArrayList<Integer> arrayList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		arrayList.add(sc.nextInt());
		System.out.println("Enter 2nd Number: ");
		arrayList.add(sc.nextInt());
		System.out.println("Enter 3rd Number: ");
		arrayList.add(sc.nextInt());
		System.out.println("List formed: " + arrayList);
		
		int maximum = arrayList.get(0);
		if(arrayList.get(1).compareTo(arrayList.get(0))>0) 
			maximum = arrayList.get(1);
		if(arrayList.get(2).compareTo(arrayList.get(1))>0) 
				maximum = arrayList.get(2);
		System.out.println("\nLargest number is: " +maximum);
	}
}
