package com.codegnan.oopconstructorsaq;

import java.util.Scanner;

public class SkyHigh {
	String flight;
	String dest;
	double fare;

	public SkyHigh(String flight, String dest,double fare) {
		this.flight=flight;
		this.dest=dest;
		this.fare=fare;
		
	}
	public void display() {
		if(fare<1) {
			System.out.print("fare must be positive");
			return;
		}
		if(flight==null || flight.trim().isEmpty()) {
			System.out.println("flight must not be empty or null");
			return;
		}
		if(dest==null || dest.trim().isEmpty()) {
			System.out.println("dest must not be empty or null");
			return;
		}
		System.out.println("Flight: "+flight+ ", Destination: "+dest+", Fare: "+fare);
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SkyHigh g =new SkyHigh(sc.next(),sc.next(),sc.nextDouble());
		g.display();
		sc.close();

		}

}
