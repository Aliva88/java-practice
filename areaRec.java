import java.util.Scanner;

class areaRec{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length ");
        int l = sc.nextInt();
        System.out.print("Enter the breath ");
        int b = sc.nextInt();
        int area = l * b;
        System.out.println("Area = " + area);
    }
}