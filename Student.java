package com.codegnan.oopconstructorsaq;

public class Student {
	int rollNumber;
	String name;
	int[] marks=new int[3];
	public Student() {
		name="Unknown";
		rollNumber=0;
		marks[0]=0;
		marks[1]=0;
		marks[2]=0;
		}
		 public Student(String name,int rollNumber,int[] marks) {
			 this.rollNumber = rollNumber;
			 this.name = name;
			 this.marks=marks;
			 }
		 public void displaydetails() {
			 System.out.println("Name : "+name);
			 System.out.println("Rollnumber : "+rollNumber);
			 //System.out.println("Marks: "+marks);
			 for(int i=0;i<marks.length;i++) {
				 System.out.print("Marks:");
				 System.out.println(marks[i]);
				 }
			 }
		 public int calculateTotal() {
			 int total=0;
			 for(int mark:marks) {
				 total+=mark;
				 }
			 return total;
			 }
		 public double calculateAverage() {
			 return (double) calculateTotal()/marks.length;
			 }
		 }
