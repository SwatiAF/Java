//ADDITION AND SUBTRACTION OF TWO COMPLEX NUMBERS

ComplexNo(double r1,double r2,double i1,double i2) {
real1= r1;
real2= r2;
img1= i1;
img2= i2;
}

void add() {
double realSum= real1 + real2;
double imgSum= img1 + img2;
System.out.println("Sum: " + realSum + "+ " + imgSum + "i");
}

void diff() {
double realDiff = real2 - real1;
double imgDiff = img2 - img1;
System.out.println("Difference: " + realDiff + "+ " + imgDiff + "i");
}
}

class Complex {
public static void main(String args[]) {
ComplexNo ob1 = new ComplexNo(1.0, 2.0, 1.5, 2.5);
ob1.add();
ob1.diff();
}
}
