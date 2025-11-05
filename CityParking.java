package com.codegnan.oopconstructorsaq;

import java.util.Scanner;

public class CityParking {
	String type;
	String plate;
	int hours;

	public CityParking(String type, String plate,int hours) {
		this.type=type;
		this.plate=plate;
		this.hours=hours;
		
	}
	public void display() {
		if(hours<0) {
			System.out.print("Hours parked must be non-negative");
			return;
		}
		if(type==null || type.trim().isEmpty()) {
			System.out.println("type cannot be empty or null");
			return;
		}
		if(plate==null || plate.trim().isEmpty()) {
			System.out.println("plate must not be empty or null");
			return;
		}
		System.out.println("Type: "+type+ ", License: "+plate+", Hours Parked: "+hours);
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CityParking g =new CityParking(sc.next(),sc.next(),sc.nextInt());
		g.display();
		sc.close();


	}

}
