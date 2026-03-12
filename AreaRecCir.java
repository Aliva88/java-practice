abstract class Shape {
abstract double area();
}

class Circle extends Shape {
double radius;

Circle(double radius) {
this.radius = radius;
}

double area() {
return 3.14 * radius * radius;
}
}

class Rectangle extends Shape {
double length;
double width;

Rectangle(double length, double width) {
this.length = length;
this.width = width;
}

double area() {
return length * width;
}
}

public class AreaRecCir {
public static void main(String[] args) {
Shape s1 = new Circle(23);
System.out.println("Circle Area: " + s1.area());

Shape s2 = new Rectangle(12, 44);
System.out.println("Rectangle Area: " + s2.area());
}
}

