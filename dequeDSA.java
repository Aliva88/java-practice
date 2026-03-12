class Deque{
  int arr[];
  int capacity;
  int size;
  int front;
  int rear;

  Deque(int capacity){
    this.capacity= capacity;
    arr = new int[capacity];
    size = 0;
    front = 0;
    rear = -1;
  
  }
  boolean isfull(){
    return size == capacity;
  }
  boolean isempty(){
    return size == 0;
  }
  void insertAtFront(int value){
    if(isfull()){
      System.out.println("Queue is full");
      return ;
    }
    
      front = (front - 1 + capacity) % capacity;
      arr[front]=value;
      size++;
      if(rear == -1){
        rear = front;
      }
  }
  void insertAtRear(int value){
    if(isfull()){
      System.out.println("Queue is full");
      return ;
    }
    rear = (rear + 1)% capacity;
    arr[rear] = value;
    size++;
  }
  int getFrontData(){
    if(isempty()){
      return -1;
    }
    return arr[front];
  }
  int getRearData(){
    if(isempty()){
      return -1;
    }
    return arr[rear];
  }
}
public class dequeDSA {
  public static void main(String[] args) {
    Deque d= new Deque(5);
  }
}
