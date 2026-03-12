import java.util.Scanner;

class time{
  int hr;
  int min;
  int sec;

  void calculate(int Sec){
    hr = Sec/3600;
    min = (Sec%3600)/60;
    sec = (Sec%3600)%60;

    System.out.println(+hr+" Hours "+min+" Minutes and "+sec+" Sec");
  }
}

public class Clock {
  public static void main(String[] args) {
    time obj = new time();
    Scanner sc = new Scanner(System.in);
    int Sec;
    System.out.print("Enter time in seconds: ");
    Sec = sc.nextInt();
    obj.calculate(Sec);
  }
}
