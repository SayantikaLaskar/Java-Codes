import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        System.out.println("Is " + num + " an ugly number? " + isUgly(num));

        scanner.close();
    }

    public static boolean isUgly(int num) {
        if (num < 1)
            return false;
        if (num == 1)
            return true;

        while (num % 2 == 0)
            num /= 2;
        while (num % 3 == 0)
            num /= 3;
        while (num % 5 == 0)
            num /= 5;

        return (num == 1);
    }
}

