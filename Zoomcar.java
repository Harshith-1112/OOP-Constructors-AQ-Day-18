package com.codegnan.oopconstructorsaq;
import java.util.Scanner;

public class Zoomcar {
	String brand;
	String model;
	double rentalprice;

	public Zoomcar(String brand, String model, double rentalprice) {
		this.brand=brand;
		this.model=model;
		this.rentalprice=rentalprice;
		
	}
	public void displaycarinfo() {
		if(rentalprice<1) {
			System.out.print("Error: Rental price must be positive");
			return;
		}
		System.out.println("Brand: "+brand+ ", Model: "+model+", price per day: "+rentalprice);
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println(sc.next());
		Zoomcar g =new Zoomcar(sc.next(),sc.next(),sc.nextDouble());
		g.displaycarinfo();
		sc.close();
		}

	}
