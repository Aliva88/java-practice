import java.util.Scanner;

public class TryCatch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a;
    int b;
    int result;
    System.out.print("Enter 1st number: ");
    a = sc.nextInt();
    System.out.print("Enter 2nd number: ");
    b = sc.nextInt();
    if(b==0){
      try {
        result = a/b;
      } catch (Exception e) {
        System.out.println("0 cannot be divided by any number...");
      }
    }
    else{
    result = a/b;
    System.out.println("Result: "+result);
    }
  }
}
