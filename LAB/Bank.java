import java.util.*;
import java.Scanner;

class Account {
	String name;
	int acc_num;
	String type_acc;
	double amount;

Account(double amt) {
	amount = amt;
}

void details() {
	Scannner sc = new Scanner(System.in);
	System.out.println("Name: ");
	name = sc.nextLine();
	System.out.println("Account Num: ");
	acc_num = sc.nextInt();
	System.out.println("Type of Account: ");
	type_acc = sc.nextLine();
}
void accept(double deposit) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Deposit Ammount: ");
	deposit = sc.nextDouble();
	double balance = amount + deposit;
	System.out.println("Current Balance: " + balance);
}
void display_bal() {
	System.out.println("Type of Account: " + type_acc);
	System.out.println("Account Number: " + acc_num);
	System.out.println("Current Balance: " + balance);
	int balance = amount;
	
}
void interest(double int_rate, double time, int n) {
	Scanner sc = new Scanner(System.in);
	double ci;
	System.out.println("Principle Amount: " + balance);
	System.out.println("Interest Rate: " + int_rate);
	int_rate = sc.nextDouble();
	System.out.println("Time Period (in months): " + time);
	time = sc.nextDouble();
	System.out.println("Num of times compounded: " + n);
	n = sc.nextInt();
	ci = balance*Math.pow((1 + (int_rate/n)), n*time) - balance;
	System.out.println("Coumpound Interest: " + ci);
}
void withdrawal(double withdraw) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Amount Withdrawn: ");
	withdraw = sc.nextDouble();
	System.out.println("Current Balance: " + balance);
	balance = amount - withdraw;
	
}

class Curr_acc extends Account {
//checkbook
void checkbook() {
	//Name, Acc_num, type_acc, balance;
	details();
	deposit();
	display_bal();
	accept(double);
	withdrawal(double);
}
//min bal, if not service charge
void fine() {
	//min bal < 1000 --> fine (100);
	//if not --> no fine
	if(amount < 1000) {
		System.out.println("Insufficient Balance");
		System.out.println("Fine: 100");
		balance = amount - 100;
		System.out.println("Balance: " + balance);
	}
	else
		balance = display_bal();
}

class Sav_acc extends Account {
	interest(double, double, int); 	//Compound Int.
	withdrawal(double);			//Withdrawal
}

class Bank {
	public static void main(String[] args) {
		Amount a1 = new Amount(double);
		super(amt);		


}
}




