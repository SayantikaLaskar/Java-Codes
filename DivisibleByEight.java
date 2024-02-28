public class DivisibleByEight {
    int checkDivisibility(String s) {
        if (s.length() <= 3) {
            return (Integer.parseInt(s) % 8 == 0) ? 1 : -1;
        } else {
            for (int i = 0; i <= s.length() - 3; i++) {
                String substr = s.substring(i, i + 3);
                if (Integer.parseInt(substr) % 8 == 0) {
                    return 1;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        DivisibleByEight solution = new DivisibleByEight();

        String input1 = "123";
        int result1 = solution.checkDivisibility(input1);
        System.out.println("Is " + input1 + " divisible by 8? " + (result1 == 1 ? "Yes" : "No"));

        String input2 = "456";
        int result2 = solution.checkDivisibility(input2);
        System.out.println("Is " + input2 + " divisible by 8? " + (result2 == 1 ? "Yes" : "No"));

        String input3 = "789";
        int result3 = solution.checkDivisibility(input3);
        System.out.println("Is " + input3 + " divisible by 8? " + (result3 == 1 ? "Yes" : "No"));
    }
}

