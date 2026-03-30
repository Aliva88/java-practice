import java.util.Scanner;
class DoublyLL {

    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }

    Node head = null;
    void insertBeginning(int data) {
        Node newnode = new Node(data);

        newnode.next = head;
        if (head != null)
            head.prev = newnode;

        head = newnode;
    }

    void insertEnd(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newnode;
        newnode.prev = temp;
    }

    void insertAtPosition(int position, int data) {
        Node newnode = new Node(data);

        if (position == 1) {
            newnode.next = head;
            if (head != null)
                head.prev = newnode;
            head = newnode;
            return;
        }

        Node temp = head;
        while (position != 2) {
            temp = temp.next;
            position--;
        }

        Node temp2 = temp.next;

        temp.next = newnode;
        newnode.prev = temp;

        newnode.next = temp2;

        if (temp2 != null)
            temp2.prev = newnode;
    }

    void deleteBeginning() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    void deleteEnd() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.prev.next = null;
        temp.prev = null;
    }

    void deleteAtPosition(int position) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (position == 1) {
            deleteBeginning();
            return;
        }

        Node temp = head;

        while (position != 1) {
            temp = temp.next;
            position--;
        }

        // If last node
        if (temp.next == null) {
            temp.prev.next = null;
            temp.prev = null;
            return;
        }

        // Middle node
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        temp.next = null;
        temp.prev = null;
    }

    void traverseForward() {
        Node temp = head;

        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void traverseBackward() {
        Node temp = head;

        if (temp == null)
            return;

        while (temp.next != null)
            temp = temp.next;

        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DoublyLL list = new DoublyLL();
        int choice;

        do {
            System.out.println("\n------MENU------");
            System.out.println("1.Insert at beginning");
            System.out.println("2.Insert at ending");
            System.out.println("3.Insert any position");
            System.out.println("4.Delete from beginning");
            System.out.println("5.Delete from ending");
            System.out.println("6.Delete from specific position");
            System.out.println("7.Traverse forward");
            System.out.println("8.Traverse backward");
            System.out.println("9.Exit");
            System.out.println("Enter your choice:");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter data:");
                    list.insertBeginning(sc.nextInt());
                    break;

                case 2:
                    System.out.println("Enter data:");
                    list.insertEnd(sc.nextInt());
                    break;

                case 3:
                    System.out.println("Enter position:");
                    int pos = sc.nextInt();
                    System.out.println("Enter data:");
                    int data = sc.nextInt();
                    list.insertAtPosition(pos, data);
                    break;

                case 4:
                    list.deleteBeginning();
                    break;

                case 5:
                    list.deleteEnd();
                    break;

                case 6:
                    System.out.println("Enter position:");
                    int p = sc.nextInt();
                    list.deleteAtPosition(p);
                    break;

                case 7:
                    list.traverseForward();
                    break;

                case 8:
                    list.traverseBackward();
                    break;

                case 9:
                    System.out.println("Exiting.........");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 9);

        sc.close();
    }
}