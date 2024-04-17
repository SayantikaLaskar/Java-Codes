import java.util.Scanner;

public class ZigzagPatternSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        int[][] a = new int[r][c];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < r; i++) {
            if (i == 0 || i == r - 1) {
                for (int j = 0; j < c; j++) {
                    sum += a[i][j];
                }
            } else {
                sum += a[i][c - 1 - i];
            }
        }

        System.out.println("Sum: " + sum);
    }
}
