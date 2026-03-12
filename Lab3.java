class Employee {

String name;
int id;
double salary;

Employee(String name, int id, double salary) {
this.name = name;
this.id = id;
this.salary = salary;
}

double calculateBonus() {
return 0;
}

void display() {
System.out.println("Name: " + name);
System.out.println("Id: " + id);
System.out.println("Salary: " + salary);
}
}

class Manager extends Employee {

Manager(String name, int id, double salary) {
super(name, id, salary);
}

double calculateBonus() {
return salary * 0.20;
}
}

class Developer extends Employee {

Developer(String name, int id, double salary) {
super(name, id, salary);
}

double calculateBonus() {
return salary * 0.10;
}
}

public class Lab3 {
public static void main(String[] args) {

Employee e;
e = new Manager("Rohan", 101, 50000);
e.display();
System.out.println("Bonus: " + e.calculateBonus());
System.out.println();
e = new Manager("Girish", 108, 70000);
e.display();
System.out.println("Bonus: " + e.calculateBonus());
System.out.println();
e = new Developer("Ankita", 102, 40000);
e.display();
System.out.println("Bonus: " + e.calculateBonus());
System.out.println();
e = new Developer("Monali", 119, 60000);
e.display();
System.out.println("Bonus: " + e.calculateBonus());
}
}