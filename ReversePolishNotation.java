import java.util.Stack;

public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        int a, b;
        Stack<Integer> S = new Stack<Integer>();
        for (String s : tokens) {
            if(s.equals("+")) {
                S.add(S.pop() + S.pop());
            }
            else if(s.equals("/")) {
                b = S.pop();
                a = S.pop();
                S.add(a / b);
            }
            else if(s.equals("*")) {
                S.add(S.pop() * S.pop());
            }
            else if(s.equals("-")) {
                b = S.pop();
                a = S.pop();
                S.add(a - b);
            }
            else {
                S.add(Integer.parseInt(s));
            }
        }
        return S.pop();
    }

    public static void main(String[] args) {
        ReversePolishNotation rpnCalculator = new ReversePolishNotation();

        String[] tokens1 = {"2", "1", "+", "3", "*"};
        System.out.println("Example 1 Result: " + rpnCalculator.evalRPN(tokens1));

        String[] tokens2 = {"4", "13", "5", "/", "+"};
        System.out.println("Example 2 Result: " + rpnCalculator.evalRPN(tokens2));

        String[] tokens3 = {"10", "6", "9", "3", "/", "-", "*"};
        System.out.println("Example 3 Result: " + rpnCalculator.evalRPN(tokens3));
    }
}

