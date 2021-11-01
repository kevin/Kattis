// open.kattis.com/problems/4thought

// 2019-06-12

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ForThought {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Combo> list = new ArrayList<>();

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                for (int k = 0; k < 4; k++) {

                    String eq = "4";
                    eq += (i % 2 == 0 ? (i == 0 ? " + 4" : " - 4") : (i == 1 ? " * 4" : " / 4"));
                    eq += (j % 2 == 0 ? (j == 0 ? " + 4" : " - 4") : (j == 1 ? " * 4" : " / 4"));
                    eq += (k % 2 == 0 ? (k == 0 ? " + 4" : " - 4") : (k == 1 ? " * 4" : " / 4"));
                    list.add(new Combo(eq, evaluate(eq)));

                }

            }

        }

        int numLines = in.nextInt();
        in.nextLine();
        for (int p = 0; p < numLines; p++) {

            int match = in.nextInt();
            boolean found = false;
            in.nextLine();
            for (Combo x : list) {

                if (x.val == match) {

                    System.out.println(x.eq + " = " + match);
                    found = true;
                    break;

                }

            }

            if (!found)
                System.out.println("no solution");

        }

    }

    static class Combo {

        String eq;
        int val;

        public Combo(String eq, int val) {

            this.eq = eq;
            this.val = val;

        }

    }

    public static int evaluate(String expression) {
        char[] tokens = expression.toCharArray();

        Stack<Integer> values = new Stack<Integer>();

        Stack<Character> ops = new Stack<Character>();

        for (int i = 0; i < tokens.length; i++) {
            // Current token is a whitespace, skip it
            if (tokens[i] == ' ')
                continue;

            if (tokens[i] >= '0' && tokens[i] <= '9') {
                StringBuffer sbuf = new StringBuffer();

                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
                    sbuf.append(tokens[i++]);
                values.push(Integer.parseInt(sbuf.toString()));
            }

            else if (tokens[i] == '(')
                ops.push(tokens[i]);

            else if (tokens[i] == ')') {
                while (ops.peek() != '(')
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                ops.pop();
            }

            else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/') {

                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));

                ops.push(tokens[i]);
            }
        }

        while (!ops.empty())
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
        return values.pop();
    }

    public static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    public static int applyOp(char op, int b, int a) {
        switch (op) {
        case '+':
            return a + b;
        case '-':
            return a - b;
        case '*':
            return a * b;
        case '/':
            if (b == 0)
                throw new UnsupportedOperationException("Cannot divide by zero");
            return a / b;
        }
        return 0;
    }

}
