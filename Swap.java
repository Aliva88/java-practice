class Swap{
    public static void main(String args[]){
        int a = 10, b = 20, temp;
        temp = a;
        a = b;
        b = temp; // using 3rd variable
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a + b;
        b = a - b;
        a = a - b; //without using 3rd variable
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
