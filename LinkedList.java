class node{
  int data;
  node next;

  node(int data){
    this.data = data;
    this.next = null;
  }
}

public class LinkedList {
  public static void main(String[] args) {
    node n1 = new node(10);
    node n2 = new node(20);
    node n3 = new node(30);
    n1.next = n2;
    n2.next = n3;

    System.out.println("First node data: "+n1.data);
    System.out.println("Second node data: "+n1.next);

    System.out.println("First node data: "+n2.data);
    System.out.println("Second node data: "+n2.next);

    System.out.println("First node data: "+n3.data);
    System.out.println("Second node data: "+n3.next);
  }
}
