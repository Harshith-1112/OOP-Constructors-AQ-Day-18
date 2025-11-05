package com.codegnan.oopconstructorsaq;

import java.util.Scanner;

public class Menuitem {
	String name;
	double price;
	String category;

	public Menuitem(String name, double price,String category) {
		this.name=name;
		this.price=price;
		this.category=category;
		
	}
	public void displayAttendance() {
		if(price<1) {
			System.out.print("Error:price must be positive");
			return;
		}
		if(name==null || name.trim().isEmpty()) {
			System.out.println("Name must not be empty or null");
			return;
		}
		if(category==null || category.trim().isEmpty()) {
			System.out.println("category must not be empty or null");
			return;
		}
		System.out.println("Item: "+name+ ", Price: "+price+", Category: "+category);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//System.out.println(sc.next());
		Menuitem g =new Menuitem(sc.next(),sc.nextDouble(),sc.next());
		g.displayAttendance();
		sc.close();

	}
}
