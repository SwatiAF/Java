//Exception Handling
import java.util.Scanner;
class FatherAgeException extends Exception {
	public String toString() {
		return ("Father's age is less than 0");
	}
}

class SonAgeException extends Exception {
	int a;
	SonAgeException(int age) {
		a = age;
	}
	public String toString() {
		if(a<0) 
			return("Son's age is less than 0");
		else 
			return("Son's age is more than father's age");
	}
}

class Father {
	public int agel;
	Scanner scan = new Scanner(System.in);
	int age1;
	Father() {
		System.out.println("Enter father's age: ");
		age1 = scan.nextInt();
	}
	void ex1() throws FatherAgeException {
		if(age1<0) 
		throw new FatherAgeException();
	}
}

class Son extends Father {
	public int age2;
	Son() {
		System.out.println("Enter son's age: ");
		age2 = scan.nextInt();
	}
	void ex2() throws SonAgeException {
		if(age2<0 || age2>super.age1)
		throw new SonAgeException(age2);
	}
}

class ExceptionMain {
	public static void main(String args[]) {
		Son s = new Son(); {
		try {
			s.ex1();
		}
		catch(FatherAgeException e) {
			System.out.println(e);
		}
		try {
			s.ex2();
		}
		catch(SonAgeException e) {
			System.out.println(e);
		}
	}
}
}



