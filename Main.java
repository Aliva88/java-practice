interface Display {
void showDetails();
}

class Circle implements Display {
double radius;

Circle(double radius) {
this.radius = radius;
}

public void showDetails() {
System.out.println("Shape: Circle");
System.out.println("Radius: " + radius);
}
}

class Rectangle implements Display {
double length;
double width;

Rectangle(double length, double width) {
this.length = length;
this.width = width;
}

public void showDetails() {
System.out.println("Shape: Rectangle");
System.out.println("Length: " + length);
System.out.println("Width: " + width);
}
}

public class Main {
public static void main(String[] args) {
Display d1 = new Circle(5);
d1.showDetails();

System.out.println();

Display d2 = new Rectangle(4, 6);
d2.showDetails();
}
}
