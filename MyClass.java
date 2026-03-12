import java.util.Scanner;

class MyStack {
    int[] arr;
    int size;
    int top;

    MyStack(int s) {
        size = s;
        arr = new int[size];
        top = -1;
    }

    // Push operation
    public void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = data;
        System.out.println(data + " pushed into stack");
    }

    // Pop operation
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Deleted element: " + arr[top--]);
    }

    // Peek operation
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element: " + arr[top]);
    }

    // isEmpty
    public void isEmpty() {
        if (top == -1)
            System.out.println("Stack is Empty");
        else
            System.out.println("Stack is NOT Empty");
    }

    // isFull
    public void isFull() {
        if (top == size - 1)
            System.out.println("Stack is Full");
        else
            System.out.println("Stack is NOT Full");
    }
}

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();
        MyStack stack = new MyStack(size);

        int choice, value;

        do {
            System.out.println("\n--- STACK MENU ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Is Empty");
            System.out.println("5. Is Full");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = sc.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    stack.isEmpty();
                    break;

                case 5:
                    stack.isFull();
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);

        sc.close();
    }
}
