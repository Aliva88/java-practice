import java.util.Scanner;

class Node{
  int data;
  Node next;

  Node(int data){
    this.data = data;
    this.next = null;
  }

  static Node head = null;

  //insert at beginning
  static void insertBegin(int data){
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
    System.out.println("Inserted at Beginning.");
  }

  //insert at end
  static void insertend(int data){
    Node newNode = new Node(data);
    if(head==null){
      head = newNode;
      return ;
    }
    Node temp = null;
    temp = head;
    while(temp.next != null){
      temp = temp.next;
    }
    temp.next = newNode;
  }

  //delete at end
  static void deleteend(){
    if(head == null){
      System.out.println("Linked list is empty");
    }
    if(head.next == null){
      System.out.println(head.data+" Deleted");
      head = null;
      return;
    }
    Node temp = head;
    while(temp.next.next != null){
      temp = temp.next;
    }
    System.out.println(temp.next.data+" Deleted");
    temp.next = null;
  }

  //delete at beggining
  static void deletebegin(){
    if(head == null){
      System.out.println("Empty");
      return ;
    }
    System.out.println(head.data+" Deleted");
    head = head.next;
  }

  //traverse
  static void traverse(){
    if(head == null){
      System.out.println("Empty");
      return;
    }
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data+" -> ");
      temp = temp.next;
    }
    System.out.println("NULL");
  }
}

public class singleLinkedListOpr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int data;
    int choice;
    do{
      System.out.println("__LINKED LIST OPRETION__");
      System.out.println("1.Insert data at Beggining");
      System.out.println("2.Insert data at End");
      System.out.println("3.Delete data from End");
      System.out.println("4.Delete data from Beggining");
      System.out.println("5.Traverse the linked list");
      System.out.println("6.Exit the program");
      System.out.print("Enter your choice: ");
      choice = sc.nextInt();

      switch(choice){
        case 1:
          System.out.print("Enter the element you at to insert: ");
          data = sc.nextInt();
          Node.insertBegin(data);
          break;

        case 2:
          System.out.print("Enter the element you at to insert: ");
          data = sc.nextInt();
          Node.insertend(data);
          break;

        case 3:
          Node.deleteend();
          break;

        case 4:
          Node.deletebegin();
          break;

        case 5:
          Node.traverse();
          break;

        case 6:
          System.out.print("__EXIT THE PROGRAM__");
          break;

        default:
          System.out.print("Invalid choice");
      }
    }
    while(choice!=6);
  }
}
