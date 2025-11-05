package com.codegnan.oopconstructorsaq;

import java.util.Scanner;

public class GreenWood {
	public class Greenwood{
		String name;
		int rollno;
		int gradelevel;
		
		public Greenwood(String name, int rollno, int gradelevel) {
			this.name=name;
			this.rollno=rollno;
			this.gradelevel=gradelevel;
			
		}
		public void showprofile() {
			if(rollno<1) {
				System.out.print("Error: Roll number must be positive");
				return;
			}
			if(gradelevel<1 || gradelevel>12) {
				System.out.print("Error: Grade level must be between 1 and 12");
				return;
			}
			System.out.println("Name: "+name+ ", Rollnumber: "+rollno+", Grade: "+gradelevel);
		}
		
		
		public  void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			//System.out.println(sc.next());
			Greenwood g =new Greenwood(sc.next(),sc.nextInt(),sc.nextInt());
			g.showprofile();
			sc.close();

		}

	}
}
