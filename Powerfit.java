package com.codegnan.oopconstructorsaq;

import java.util.Scanner;

public class Powerfit {
	String name;
	String plan;
	double fee;

	public Powerfit(String name, String plan,double fee) {
		this.name=name;
		this.plan=plan;
		this.fee=fee;
		
	}
	public void display() {
		if(fee<1) {
			System.out.print("fee must be positive");
			return;
		}
		if(name==null || name.trim().isEmpty()) {
			System.out.println("name cannot be empty or null");
			return;
		}
		if(plan==null || plan.trim().isEmpty()) {
			System.out.println("plan must not be empty or null");
			return;
		}
		System.out.println("Member: "+name+ ", Plan: "+plan+", Fee: "+fee);
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Powerfit g =new Powerfit(sc.next(),sc.next(),sc.nextDouble());
		g.display();
		sc.close();

	}

}
