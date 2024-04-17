import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int c = 0;
        
        while (n != 1) {
            int s; 
            
            if (n % 2 == 0) {
                s = n / 2;
            } else {
                s = (3 * n) + 1;
            }
            
            System.out.println(s); 
            n = s; 
            c++; 
        }
        
        System.out.println("Number of steps: " + c);
    }
}
