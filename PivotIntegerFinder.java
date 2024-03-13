import java.util.Scanner;

class PivotIntegerFinder {
    public static int findPivotInteger(int n) {
        int sum = n * (n + 1) / 2;
        double sqrtSum = Math.sqrt(sum);

        if (sqrtSum - Math.ceil(sqrtSum) == 0) 
            return (int) sqrtSum;
        else 
            return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        int pivot = findPivotInteger(n);
        if (pivot != -1) {
            System.out.println("Pivot integer for " + n + " is: " + pivot);
        } else {
            System.out.println("No pivot integer found for " + n);
        }

        scanner.close();
    }
}

