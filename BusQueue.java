import java.util.Scanner;

public class BusQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the total number of passengers: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the number of passengers at each position in the queue: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int sum = 0;
        int buses = 0;
        for (int i = 0; i < n; i++) {
            if (sum + a[i] > n) {
                buses++;
                sum = a[i];
            } else {
                sum += a[i];
            }
        }
        if (sum > 0) {
            buses++;
        }
        System.out.println("Number of buses required: " + buses);
    }
}
