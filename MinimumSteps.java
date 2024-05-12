public class MinimumSteps {
    static int minSteps(int d) {
        int cnt = 0, i = 0;
        while (i < d || (i - d) % 2 != 0) {
            cnt++;
            i += cnt;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int d = 10; 

        int minStepsRequired = minSteps(d);

        System.out.println("Minimum steps required: " + minStepsRequired);
    }
}

