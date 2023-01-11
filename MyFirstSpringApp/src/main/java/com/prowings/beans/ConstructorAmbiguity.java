package com.prowings.beans;

public class ConstructorAmbiguity {
	int i;
	int j;
//	double k;
//	double l;
//	
//	String s;
//	String p;

	public ConstructorAmbiguity() {
		super();
	}

	public ConstructorAmbiguity(String i, int j) {
		super();
		System.out.println("int int Invoked");
		this.i = Integer.parseInt(i);
		this.j = j;
	}

	public ConstructorAmbiguity(double k, double l) {
		super();
		System.out.println("double double Invoked");
		this.i = (int) k;//type casting for double to int.
		this.j = (int) l;
	}

	public ConstructorAmbiguity(int j, String p) {
		super();
		System.out.println("String String");
		this.i = j;//converting string to integer
		this.j = Integer.parseInt(p);
	}

}
