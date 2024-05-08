public class DivisorGame {
    public static boolean divisorGame(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int n = 6; // Change the value of n as needed
        boolean result = divisorGame(n);
        System.out.println("Can Alice win the Divisor Game with " + n + " stones? " + (result ? "Yes" : "No"));
    }
}
