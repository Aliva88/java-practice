import java.util.Scanner;

public class CircularQopr {
  static int rear = 0;
	static int front = 0;
	static int max = 5;
	static int[] queue = new int[max];
  static int count = 0;

  //insert
  static void enqueue(int value){
    if(count == max){
      System.out.println("Circular Queue is full");
    }
    else{
      queue[rear] = value;
      rear = (rear+1)%max;
      System.out.println("Rear = "+rear+" Front = "+front);
      count++;
    }
  }

  //delete
  static void dequeue(){
    if(count == 0){
      System.out.println("Circular Queue is empty");
    }
    else{
      System.out.println("Deleted element is = "+queue[front]);
      front = (front+1)%max;
      count--;
      System.out.println("Front = "+front+" Rear = "+rear);
    }
  }

  //traverse
  static void traverse(){
    if(count == 0){
      System.out.println("Queue is empty");
    }
    else{
      System.out.println("The elements are: ");
      int i = front;
      for(int j=0; j<count; j++){
        System.out.print(queue[i]+" ");
        i = (i+1)%max;
      }
      System.out.println();
    }
  }

  public static void main(String a[]){
		
		Scanner sc = new Scanner(System.in);
		int choice, value;

		do{
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Traverse");
			System.out.println("4.Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch(choice){
				case 1:
				System.out.print("Enter the value you want to insert: ");
				value = sc.nextInt();
				enqueue(value);
				break;

				case 2:
				dequeue();
				break;

				case 3:
				traverse();
				break;

				case 4:
				System.out.println("Exit..");
				break;

				default:
				System.out.println("Invalid choice");
			}
		}
		while(choice!=4);
	}
}
