import java.util.*;
import java.lang.*;

abstract class Shape {
	int length;
	int breadth;

Shape(int l, int b) {
	length = l;
	breadth = b;

}
Shape(int l) {
	length = l;
}
abstract double printArea();
}

class Rectangle extends Shape {
	Rectangle(int l, int b) {
	super(l, b);
}

double printArea() {
	System.out.println("Area of Rectangle: ");
	return length*breadth;
}
}
	
class Triangle extends Shape {
	Triangle(int l, int b) {
	super(l, b);
}

double printArea() {
	System.out.println("Area of the Triangle: ");
	return length*breadth / 2;
}
}

class Circle extends Shape {
	Circle(int l) {
	super(l);
}

double printArea() {
	System.out.println("Area of Circle: ");
	return 3.142*length*length;
}
}

class Area{
	public static void main(String[] args) {
	Rectangle r = new Rectangle(5, 2);
	Triangle t = new Triangle(5,2);
	Circle c = new Circle(1);
	Shape ref;
	
	ref = r;
	System.out.println("Area: " + ref.printArea());
	ref = t;
	System.out.println("Area: " + ref.printArea());
	ref = c;
	System.out.println("Area: " + ref.printArea());
}
}
	

