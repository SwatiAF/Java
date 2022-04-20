/*Create a class Student with members : Rollno, name, mark1, mark2, mark3, totmarks. Create n students. Include the following methods:
i. to accept the details
ii. to display the details
iii. Calculate total marks of each student and update the member.
Accept a value say cutoff marks through command line and display the details of all students who have scored total marks greater than cutoff marks.*/

import java.util.*;

class Student {
	int Rollno;
	String name;
	double mark1, mark2, mark3;

void accept() {
Scanner scan = new Scanner(System.in);
	System.out.print("Enter name: ");
	name = scan.nextLine();
	System.out.print("Enter roll no: ");
	Rollno = scan.nextInt();
	System.out.print("Enter mark1: ");
	mark1 = scan.nextInt();
	System.out.print("Enter mark2: ");
	mark2 = scan.nextInt();
	System.out.print("Enter mark3: ");
	mark3 = scan.nextInt();
}

void display() {
	System.out.println("Name: " + name);
	System.out.println("Roll no: " + Rollno);
	System.out.println("Marks1: " + mark1);
	System.out.println("Marks2: " + mark2);
	System.out.println("Marks2: " + mark3);
}

double total() {
	return (mark1 + mark2 + mark3);
	}
}

class CmdStudent {
	public static void main(String args[]) {
		Student s1 = new Student();
		Student s2 = new Student();
		double totalMarks;
	
	System.out.println("Details of s1: ");
	s1.accept();
	s1.display();
	totalMarks = s1.total();
	System.out.println("Total marks: " + totalMarks);

	System.out.println();

	System.out.println("Details of s2: ");
	s2.accept();
	s2.display();
	totalMarks = s2.total();
	System.out.println("Total marks: " + totalMarks);

  //To pass Arguments of type Double and not string.
	for(String str: args) {
	double argument = Double.parseDouble(str);
	System.out.println();
	System.out.println("Enter cutoff marks: " + argument);

//This block of code should accomodate n objects defined, not only 2
	if(s1.total() > argument && s2.total() > argument) {
		System.out.println("Students scored more than cutoff: ");
		s1.display();
		System.out.println();
		s2.display();
	} else if(s1.total() > argument) {
		System.out.println("Student scored more than cutoff: ");
		s1.display();
	} else if(s2.total() > argument) {
		System.out.println("Student scored more than cutoff: ");
		s2.display();
	} else {
		System.out.println("None of them scored more than the cutoff");
	}
}	

}
}
