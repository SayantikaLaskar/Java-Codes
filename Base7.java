import java.util.Scanner;

public class Base7 {
    public static String convertToBase7(int num) {
        return Integer.toString(num, 7);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        String base7Representation = convertToBase7(num);
        System.out.println("The base 7 representation of " + num + " is: " + base7Representation);

        scanner.close();
    }
}
