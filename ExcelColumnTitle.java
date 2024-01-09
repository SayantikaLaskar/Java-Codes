public class ExcelColumnTitle {

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            // Convert the remainder to a character and add it to the result
            int remainder = (columnNumber - 1) % 26;
            result.insert(0, (char) ('A' + remainder));
            // Update columnNumber for the next iteration
            columnNumber = (columnNumber - 1) / 26;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int columnNumber = 701;
        System.out.println(convertToTitle(columnNumber)); // Output: "ZY"
    }
}
