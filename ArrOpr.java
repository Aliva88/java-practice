import java.util.Scanner;

class ArrayOpr
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		int size = 0;
		int choice;
		do
		{
			System.out.println("--Array Operation--");
			System.out.println("1. Create Array");
			System.out.println("2. Traverse Array");
			System.out.println("3. Insert Element");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
				System.out.print("Enter the size of the array");
		   		size = sc.nextInt();
				System.out.print("Enter the elements of the array");
				for(int i=0; i<size; i++)
				{
					arr[i] = sc.nextInt();
				}
				System.out.println("Array is created");
				break;

				case 2:
				if(size==0)
				{
					System.out.println("Array is empty");
				}
				else
				{
					System.out.println("Array elements are:");
					for(int i=0; i<size; i++)
					{
						System.out.print(arr[i]+" ");
					}
				System.out.println();
				}
				break;

				case 3:
				if(size == arr.length)
				{
					System.out.println("Array is full");
				}
				else{
					System.out.println("Enter the position where to  insert element ");
					int pos = sc.nextInt();
					if(pos<0||pos>size)
					{
						System.out.println("Invalid Positin");
						break;
					}
					System.out.println("Enter the element  you want to insent");
					int element = sc.nextInt();
					int index = pos;
					
					for(int i=size; i>index; i--)
					{
						arr[i]=arr[i-1];
					}
					arr[index] = element;
					size++;
					System.out.println("Element inserted");
				}
				break;

				case 4:
				System.out.println("--Program Exit--");
				break;

				default:
				System.out.println("Invalid choice");
			}
		}
		while(choice!=4);
		sc.close();
	}
}