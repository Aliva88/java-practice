class ThEven implements Runnable{
  public void run(){
    System.out.println("Even numbers are: ");
    for(int i=1;i<=50;i++){
      if(i%2==0){
        System.out.print(i+" ");
      }
    }
  }
}
class ThCon implements Runnable{
  public void run(){
    System.out.println("Consonants are: ");
    for(char ch = 'A'; ch<='Z';ch++){
      if(ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!= 'U'){
        System.out.print(ch+" ");
      }
    }
  }
}
public class ThEvenCon{
  public static void main(String[] args) {
    ThEven Th1 = new ThEven();
    ThCon Th2 = new ThCon();
    Thread Even = new Thread(Th1);
    Even.start();
    Thread Con = new Thread(Th2);
    Con.start();
  }
}