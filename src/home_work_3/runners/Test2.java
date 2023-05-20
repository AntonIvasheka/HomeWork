package home_work_3.runners;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayDeque;
import java.util.Stack;

public class Test2 {
    public static void main(String[] args) {
        String inStr = "4.1 + 15 * 7 + (28 / 5) ^ 2";


        System.out.println(inStr);
        String str = inStr.replaceAll(" +", "");
        System.out.println(str);
        System.out.println(getPN(str));
        MathContext mc = new MathContext(7);
        BigDecimal resalt = new BigDecimal(getPNtoRes(getPN(str).toArray(new String[getPN(str).size()])), mc);
        System.out.println(resalt);

        BigDecimal a = new BigDecimal(4.1, mc);
        BigDecimal b = new BigDecimal(5.8, mc);
        System.out.println(a.add(b));
    }
    public static double getPNtoRes(String[] rpn) {
        Stack<Double> stack = new Stack<>();
        double val;
        double deg;
        for (int i = 0; i < rpn.length; i++) {
            switch (rpn[i]) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    val = stack.pop();
                    stack.push(stack.pop() - val);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    val = stack.pop();
                    stack.push(stack.pop() / val);
                    break;
                case "^":
                    deg = stack.pop();
                    val = stack.pop();
                    for (int j = 2; j <= deg; j++) {
                        val = val * val;
                    }
                    stack.push(val);
                    break;
                default:
                    stack.push(Double.parseDouble(rpn[i]));
                    System.out.println(stack.peek());
            }
        }
        //System.out.println(stack.peek());
        return stack.pop();
    }
    private static ArrayDeque<String> getPN(String text) {
        ArrayDeque<String> box1 = new ArrayDeque<>();
        Stack<String> box2 = new Stack<>();
        char symbol;
        String tmp = new String();
        for( int i = 0; i < text.length(); i += 1) {
            symbol = text.charAt(i);
            if (isDigit(symbol)) {
                tmp += String.valueOf(symbol);
                if (i == text.length() - 1 || !isDigit(text.charAt(i + 1))) {
                    box1.add(tmp);
                    tmp = "";
                }
            }else if (notDigit(symbol)) {
                    if (getPriority(symbol) == 1) {
                        box2.push(String.valueOf(symbol));
                    }else if (getPriority(symbol) > 1) {
                        while (box2.size() != 0) {
                            if (getPriority(box2.peek().charAt(0)) >= getPriority(symbol)) {
                                box1.add(box2.pop());
                            } else {
                                break;
                            }
                        }
                        box2.push(String.valueOf(symbol));

                    } else if (getPriority(symbol) == -1) {
                        while (getPriority(box2.peek().charAt(0)) != 1){
                            box1.add(box2.pop());
                        }
                        box2.pop();

                    }
                }

            }
        while (!box2.isEmpty()) {
            box1.add(box2.pop());
        }
        return box1;
    }
    private static boolean isDigit (char c) {
        if (c >= '0' && c<= '9' || c == '.') {
            return true;
        } else {
            return false;
        }
    }
    private static boolean notDigit (char c) {
      if (c == '(' || c == ')' || c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
           return true;
      }
       return false;
    }
    private static int getPriority (char c) {
        if (c == '/' || c == '*' || c == '^') {
            return 4;
        } else if (c == '+' || c == '-') {
            return 3;
        }
        //else if (c == '^') {
       //     return 2;
       // }
        else  if (c == '(') {
            return 1;
        } else if (c == ')') {
            return -1;
        }
        return 0;
    }
}
