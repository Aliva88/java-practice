import java.util.Scanner;

public class TryMultipleCatch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr1 = new int[10];
    int[] arr2 = new int[10];
    int[] arr3 = new int[10];
    int size;
    System.out.print("Enter the size of both array: ");
		   		size = sc.nextInt();
        if(size > 10){
          try {
            System.out.println(+size);
          } catch (Exception e) {
            System.out.println("The size of array can't be greater then 10");
          }
        }
				System.out.print("Enter the elements of 1st array: ");
				for(int i=0; i<size; i++)
				{
					arr1[i] = sc.nextInt();
				}
				System.out.println("1st Array is created");

				System.out.print("Enter the elements of 2nd array: ");
				for(int i=0; i<size; i++)
				{
					arr2[i] = sc.nextInt();
				}
				System.out.println("2nd Array is created");
    
    for(int i=0; i<size; i++){
      if(arr2[i]==0){
        try {
          arr3[i] = arr1[i]/arr2[i];
        } catch (Exception e) {
          System.out.println("0 cannot be divided by any number...");
      }
    }
    arr3[i] = arr1[i]/arr2[i];
  }
  System.out.print("The new array created is: ");
  for(int i=0; i<size; i++){
    System.out.print(+arr3[i]+" ");
  }
}
}
