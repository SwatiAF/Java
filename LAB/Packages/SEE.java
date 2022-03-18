//SEE PACKAGE

package SEE;
import java.SEE.*;
import java.util.Scanner;
class External extends Student {
	int final_marks[] = new int[5];

/*public External(int final_marks) {
	this.final_marks = final_marks;
}*/

public void enterSEE() {
	Scanner scan = new Scanner(System.in);
for(int i=0; i<5; i++) {
	System.out.println("Enter SEE marks for 5 Courses: ");
	final_marks[i] = scan.nextInt();
}
}

public void displaySEE() {
for(int i=0; i<5; i++) {
	System.out.println("SEE Marks: " + final_marks[i]);
}
}

}	


