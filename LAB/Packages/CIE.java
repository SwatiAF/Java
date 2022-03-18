//CIE PACKAGE

import java.util.Scanner;

package CIE;
public class Student {
	String usn, name;
	int sem;

public Student(String usn, String name, int sem) {
	this.usn = usn;
	this.name = name;
	this.sem = sem;
}

public void enterDetails(String usn, String name, int sem) {
	Scanner scan = new Scanner(System.in);	
	System.out.println("Enter USN: ");
	usn = scan.nextLine();
	System.out.println("Enter Name: ");
	name = scan.nextLine();
	System.out.println("Enter Semester: ");
	sem = scan.nextInt();
}

public void displayDetails() {
	System.out.println("Student Details: ");
	System.out.println("USN: " + usn);
	System.out.println("Name: " + name);
	System.out.println("Semester: " + sem);	
}
}

public class Internals {
	int marks[] = new int[5];
	
public Internals(int marks) {
	this.marks = marks;
}

public void enterMarks(int marks) {
	Scanner scan = new Scanner(System.in);
for(int i=0; i<5; i++) {
	System.out.println("Enter Marks in 5 Courses: ");
	marks[i] = scan.nextInt();	
}
}

public void displayMarks() {
	for(int i=0; i<5; i++)
	System.out.println("Enter Marks in 5 Courses: " + marks[i]);	
}
}







	
	


