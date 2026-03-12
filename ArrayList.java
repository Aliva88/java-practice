import java.util.*;

public class ArrayList {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[100];
    int size ;
    int element;
    int count=0;
    
    System.out.print("Enter the size of array: ");
    size = sc.nextInt();
    System.out.print("Enter the elements of the array: ");
    for(int i=0;i<size;i++){
      arr[i]= sc.nextInt();
    }
    int i=0;
    while(arr[i]<size){
      count++;
    }
    int j=count+1;
    System.out.print("Enter the element you want to search: ");
    element = sc.nextInt();
    for(i=0;i<size;i++){
      if(element==arr[i]){
        System.out.print("Enter another element to insert: ");
        arr[j]= sc.nextInt();
        size++;
      }
    }
    System.out.println("Array elements are: ");
    for(int k=0;k<size;k++){
      System.out.print(+arr[k]+" ");
    }
  }
}
