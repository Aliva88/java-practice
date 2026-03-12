import java.util.Scanner;

class evenodd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number that you want to check");
        int n = sc.nextInt();

        if(n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}