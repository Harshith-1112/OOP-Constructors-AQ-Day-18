package com.codegnan.oopconstructorsaq;

import java.util.Scanner;

public class Fitlife {
	String name;
	double steps;
	double calories;

	public Fitlife(String name, double steps,double calories) {
		this.name=name;
		this.steps=steps;
		this.calories=calories;
		
	}
	public void display() {
		if(calories<0) {
			System.out.print("Error:colories must be nonnegative");
			return;
		}
		if(name==null || name.trim().isEmpty()) {
			System.out.println("Name must not be empty or null");
			return;
		}
		if(steps<1) {
			System.out.println("Error:colories must be nonnegative");
			return;
		}
		System.out.println("User: "+name+ ", Steps: "+steps+", Calories Burned: "+calories);
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Fitlife g =new Fitlife(sc.next(),sc.nextDouble(),sc.nextDouble());
		g.display();
		sc.close();


	}

}

