import java.util.Scanner;
class Node{
  int data;
  Node next;
  static Node top;
  
  Node(int data){
    this.data = data;
    this.next = null;
  }
  static void push(int data){
    Node newNode = new Node(data);
    if(top == null){
      top = newNode;
    }
    else{
      newNode.next = top;
      top = newNode;
    }
  }

  static void pop(){
    if(top == null){
      System.out.println("Stack is empty");
      return;
    }
    System.out.println(top.data+" :Deleted");
    top = top.next;
  }

  static void traverse(){
    if(top == null){
      System.out.println("Stack is Empty");
      return;
    }
    Node temp = top;
    while(temp != null){
      System.out.print(temp.data+" -> ");
      temp = temp.next;
    }
    System.out.println("NULL");
  }
}

public class stackLinkedList {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int data;
    int choice;
    do{
      System.out.println("__STACK USING LINKED LIST__");
      System.out.println("Push");
      System.out.println("Pop");
      System.out.println("Traverse");
      System.out.println("Exit");
      System.out.println("Enter your choice");
      choice = sc.nextInt();

       switch(choice){
        case 1:
          System.out.print("Enter the element you at to insert: ");
          data = sc.nextInt();
          Node.push(data);
          break;

        case 2:
          Node.pop();
          break;

        case 3:
          Node.traverse();
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
