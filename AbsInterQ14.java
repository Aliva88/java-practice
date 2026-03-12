abstract class Shape {
abstract double area();   // abstraction
}
interface Perimeter {
double perimeter();   // interface method
}
class Rectangle extends Shape implements Perimeter {   // multiple inheritance
double length;
double width;
Rectangle(double length, double width) {
this.length = length;
this.width = width;
}
double area() {
return length * width;
}
public double perimeter() {
return 2 * (length + width);
}
}
public class AbsInterQ14 {
public static void main(String[] args) {
Rectangle r = new Rectangle(34, 23);
System.out.println("Area of the Rectangle: " + r.area());
System.out.println("Perimeter of the Rectangle: " + r.perimeter());
}
}







