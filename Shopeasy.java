package com.codegnan.oopconstructorsaq;

import java.util.Scanner;

public class Shopeasy {
	String name;
	double price;
	int quantity;

	public Shopeasy(String name, double price,int quantity) {
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		
	}
	public void display() {
		if(price<1) {
			System.out.print("price must be positive");
			return;
		}
		if(name==null || name.trim().isEmpty()) {
			System.out.println("Name must not be empty or null");
			return;
		}
		if(quantity<0) {
			System.out.println("quantity is nonnegative");
			return;
		}
		System.out.println("Product: "+name+ ", Price: "+price+", Quantity: "+quantity);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//System.out.println(sc.next());
		Shopeasy g =new Shopeasy(sc.next(),sc.nextDouble(),sc.nextInt());
		g.display();
		sc.close();
	}
}
