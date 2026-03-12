import java.util.Scanner;

class QueueOpr{
	static int rear = 0;
	static int front = 0;
	static int max = 5;
	static int[] queue = new int[max];
	
	//insert
	static void enqueue(int value){
		if(rear == max){
			System.out.println("The Queue is full");
		}
		else{
			queue[rear] = value;
			rear++;
			System.out.println("Rear = "+rear+" Front = "+front);
		}
	}

	//delete
	static void dequeue(){
		if(rear == front){
			System.out.println("The Queue is empty");		
		}
		else{
			System.out.println("Delete = "+queue[front]);
			front++;
			System.out.println("Front = "+front+" Rear = "+rear);
		}
	}

	//traverse
	static void traverse(){
		if(rear == front){
			System.out.println("The Queue is empty");
		}
		else{
			System.out.println("Queue elements are:");
			for(int i=front ; i<rear ; i++){
				System.out.print(queue[i]+" ");
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