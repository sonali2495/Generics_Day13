package com.bridgelabz.Generics_Day13.view;

import com.bridgelabz.Generics_Day13.model.Maximum;

public class UserInterface {

	public void display() {
		System.out.println("To Find the Largest Number :\n");
		Maximum maximum = new Maximum();
		maximum.findMax();
	}

}
