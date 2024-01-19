public class DigitalRoot {

    public static int addDigits(int num) {
        while (num >= 10) {
            num = sumDigits(num);
        }
        return num;
    }

    private static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = addDigits(456);
        System.out.println(result);
    }
}
