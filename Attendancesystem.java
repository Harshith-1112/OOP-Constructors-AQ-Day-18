package com.codegnan.oopconstructorsaq;

import java.util.Scanner;

public class Attendancesystem {
	int ID;
	String name;
	String status;

	public Attendancesystem(int ID, String name, String status) {
		this.ID=ID;
		this.name=name;
		this.status=status;
		
	}
	public void displayAttendance() {
		if(ID<1) {
			System.out.print("Error: ID must be positive");
			return;
		}
		if(name==null || name.trim().isEmpty()) {
			System.out.println("Error: Name must not be empty or null");
			return;
		}
		if(!status.equalsIgnoreCase("present") && !status.equalsIgnoreCase("Absent")) {
			System.out.println("Error: Status must be \"Present\" or \"Absent\"");
			return;
		}
		System.out.println("ID: "+ ID + ", Name: "+ name +", Status: "+ status);
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id = sc.nextInt();
        sc.nextLine(); // consume the leftover newline
        String name = sc.nextLine();
        String status = sc.nextLine();
		//System.out.println(sc.next());
		Attendancesystem g =new Attendancesystem(id, name, status);
		g.displayAttendance();
		sc.close();

	}

}
