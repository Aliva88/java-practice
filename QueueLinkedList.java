import java.util.Scanner;
class Node{
  int data;
  Node next;
  static Node front = null;
  static Node rear = null;

  Node(int data){
    this.data = data;
    this.next = null;
  }

  static void Insert(int data){
    Node newNode = new Node(data);
    if(rear == null){
      front = rear = newNode;
    }
    else{
      rear.next = newNode;
      rear = newNode;
    }
    System.out.println("Data is inserted");
  }

  static void Delete(){
    if(front == null){
      System.out.println("Stack is empty");
      return;
    }
    System.out.println(front.data+" :Deleted");
    front = front.next;
    if(front == null){
      rear = null;
    }
  }

  static void Traverse(){
    if(front == null){
      System.out.println("Stack is Empty");
      return;
    }
    Node temp = front;
    while(temp != null){
      System.out.print(temp.data+" -> ");
      temp = temp.next;
    }
    System.out.println("NULL");
  }
}

public class QueueLinkedList {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int data;
    int choice;
    do{
      System.out.println("__QUEUE USING LINKED LIST__");
      System.out.println("1.Insert");
      System.out.println("2.Delete");
      System.out.println("3.Traverse");
      System.out.println("4.Exit");
      System.out.print("Enter your choice: ");
      choice = sc.nextInt();

       switch(choice){
        case 1:
          System.out.print("Enter the element you at to insert: ");
          data = sc.nextInt();
          Node.Insert(data);
          break;

        case 2:
          Node.Delete();
          break;

        case 3:
          Node.Traverse();
          break;

        case 4:
          System.out.print("__EXIT THE PROGRAM__");
          break;

        default:
          System.out.print("Invalid choice");
      }
    }while(choice!=4);
  }
}
