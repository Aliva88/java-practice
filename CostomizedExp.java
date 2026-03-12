import java.util.Scanner;
class TooYoungExeption extends RuntimeException{
  TooYoungExeption(String msg){
    super(msg);
  }
}
class TooOldExeption extends RuntimeException{
  TooOldExeption(String msg){
    super(msg);
  }
}
public class CostomizedExp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int age;
    System.out.print("Enter your age: ");
    age = sc.nextInt();
    if(age<18){
      throw new TooYoungExeption("Wait for some years");
    }

    if(age>60){
      throw new TooOldExeption("Your time is crossed");
    }
    else{
      System.out.println("You are elisible for marriage");
    }
  }
}
