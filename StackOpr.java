class mystack {
  int []arr;
  int size;
  int top;

  mystack(int s){
    size = s;
    arr = new int[size];
    top = -1;
  }
  public void push(int data) {
    if(top==size-1) {
      System.out.println("Stack in overflow");
      return ;
    }
    top++;
    arr[top] = data;
  }
  public int pop() {
    if(top == -1) {
      System.out.println("Stack underflow");
      return -1;
    }
    top--;
    return arr[top];
  }
  public int peek() {
    if(top == -1)
    {
      System.out.println("Stack underflow");
      return -1;
    }
    return arr[top];
  }
  public boolean isEmpty() {
    if(top >= 0)
    {
      return false;
    }
    return true;
  }
  public boolean isFull() {
    if(top == size-1)
    {
      return true;
    }
    return false;
  }
}
public class StackOpr {
  public static void main(String[] args){
    mystack stack = new mystack(5);
    System.out.println("Is Empty: "+stack.isEmpty());

    stack.push(120);
    stack.push(130);
    stack.push(140);
    stack.push(150);
    stack.push(160);
    System.out.println("Is Empty: "+stack.isEmpty());
    System.out.println("Is Full: "+stack.isFull());
    System.out.println("Top element: "+stack.peek());
    System.out.println("Delet element: "+stack.pop());
    System.out.println("Top element: "+stack.peek());
    System.out.println("Is Full: "+stack.isFull());
    stack.pop();
    System.out.println("Top element: "+stack.peek());
  }
}
