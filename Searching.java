import java.util.*;

public class SearchProgram {

    // Linear Search Method
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // element found
            }
        }
        return -1; // element not found
    }

    // Binary Search Method (Array must be sorted)
    public static int binarySearch(int arr[], int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1; // element not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
	
        System.out.println("\nChoose Search Method");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        int result;

        switch (choice) {
            case 1:
                result = linearSearch(arr, key);
                if (result != -1)
                    System.out.println("Element found at index: " + result);
                else
                    System.out.println("Element not found.");
                break;

            case 2:
                Arrays.sort(arr); // Binary search requires sorted array
                System.out.println("Sorted Array: " + Arrays.toString(arr));
                result = binarySearch(arr, key);
                if (result != -1)
                    System.out.println("Element found at index: " + result);
                else
                    System.out.println("Element not found.");
                break;

            default:
                System.out.println("Invalid choice!");
        }
	

        sc.close();
    }
}
