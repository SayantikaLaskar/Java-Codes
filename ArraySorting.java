import java.util.Scanner;

public class ArraySorting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Is the array sorted? " + isSorted(arr, size));
        scanner.close();
    }

    // Recursive method to check if an array is sorted in ascending order.
    public static boolean isSorted(int[] arr, int n) {
        // Base case: If the array has 0 or 1 element, it is considered sorted.
        if (n <= 1) {
            return true;
        }

        // Recursive case: Check if the last two elements are in ascending order,
        // and recursively check the rest of the array.
        return (arr[n - 2] <= arr[n - 1]) && isSorted(arr, n - 1);
    }
}

