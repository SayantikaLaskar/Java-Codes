import java.util.Scanner;

public class kaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sq = n * n; 
        int c = 0, temp = n;
 
        while (temp != 0) {
            temp /= 10;
            c++;
        }
        
        int p = (int)Math.pow(10, c);
        int q = sq / p;
        int rem = sq % p;
        int sum = q + rem;
        
        if (sum == n) {
            System.out.println("The number is a Kaprekar number.");
        } else {
            System.out.println("The number is not a Kaprekar number.");
        }
    }
}
