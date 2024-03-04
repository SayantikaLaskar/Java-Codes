import java.util.Scanner;

public class SwitchFlowControlProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Check Leap Year");
        System.out.println("2. Check Odd or Even");
        System.out.println("3. Find the Biggest Number");
        System.out.println("4. Calculate Factorial");
        System.out.println("5. Print Fibonacci Series");
        System.out.println("6. Calculate Student Grade");
        
        System.out.print("Enter your choice (1-6): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a year to check if it's a Leap year: ");
                int year = scanner.nextInt();
                checkLeapYear(year);
                break;

            case 2:
                System.out.print("Enter a number to check if it's odd or even: ");
                int number = scanner.nextInt();
                checkOddEven(number);
                break;

            case 3:
                System.out.print("Enter the count of numbers: ");
                int n = scanner.nextInt();
                findBiggestNumber(n);
                break;

            case 4:
                System.out.print("Enter a number to calculate its factorial: ");
                int factorialNumber = scanner.nextInt();
                calculateFactorial(factorialNumber);
                break;

            case 5:
                System.out.print("Enter the count for Fibonacci series: ");
                int fibCount = scanner.nextInt();
                printFibonacciSeries(fibCount);
                break;

            case 6:
                System.out.print("Enter the student's marks: ");
                int marks = scanner.nextInt();
                calculateStudentGrade(marks);
                break;

            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                break;
        }
        scanner.close();
    }

    private static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap year.");
        } else {
            System.out.println(year + " is not a Leap year.");
        }
    }

    private static void checkOddEven(int number) {
        switch (number % 2) {
            case 0:
                System.out.println(number + " is an even number.");
                break;
            case 1:
                System.out.println(number + " is an odd number.");
                break;
        }
    }

    private static void findBiggestNumber(int count) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int currentNumber = scanner.nextInt();
            if (currentNumber > max) {
                max = currentNumber;
            }
        }

        System.out.println("The biggest number is: " + max);
        scanner.close();
    }

    private static void calculateFactorial(int n) {
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
    }

    private static void printFibonacciSeries(int count) {
        int first = 0, second = 1;

        System.out.print("Fibonacci series of count " + count + " is: ");
        for (int i = 0; i < count; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    private static void calculateStudentGrade(int marks) {
        switch (marks / 10) {
            case 9:
            case 10:
                System.out.println("Grade A");
                break;
            case 8:
                System.out.println("Grade B");
                break;
            case 7:
                System.out.println("Grade C");
                break;
            default:
                System.out.println("Fail");
                break;
        }
    }
}

