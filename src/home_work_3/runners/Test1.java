package home_work_3.runners;

import java.util.ArrayDeque;
import java.util.Stack;

public class Test1 {
    public static void main(String[] args) {
        //String inStr = new String();
        String inStr = "(100-50) /5";
        System.out.println(inStr);
        String str = inStr.replaceAll(" +", "");
        System.out.println(str);
        String out = String.valueOf(getPN(str));
        System.out.println(out);
        System.out.println(getPNtoRes(out));
    }
    public static Double getPNtoRes(String rpn) {
        Stack<Double> stack = new Stack<>();
        String oper = new String();
        for (int i = 1; i < rpn.length(); i++) {
            if (getPriority(rpn.charAt(i)) == 0) {
                oper += rpn.charAt(i++);
            if (i == rpn.length()) {
                break;
            }
                System.out.println(oper);
            stack.push(Double.parseDouble(oper));
            oper = new String();
            }
            if (getPriority(rpn.charAt(i)) > 1) {
                double a = stack.pop();
                double b = stack.pop();
                if (rpn.charAt(i) == '+') {
                    stack.push(b+a);
                    break;
                }
                if (rpn.charAt(i) == '-') {
                    stack.push(b-a);
                    break;
                }
                if (rpn.charAt(i) == '*') {
                    stack.push(b*a);
                    break;
                }
                if (rpn.charAt(i) == '+') {
                    stack.push(b/a);
                    break;
                }
            }

        }
        return stack.pop();
    }
    private static ArrayDeque<String> getPN(String text) {
        ArrayDeque<String> box1 = new ArrayDeque<>();
        Stack<String> box2 = new Stack<>();
        char symbol;
        String tmp = new String();
        for( int i=0; i<text.length(); i += 1) {
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
      if (c == '(' || c == ')' || c == '+' || c == '-' || c == '*' || c == '/') {
           return true;
      }
       return false;
    }
    private static int getPriority (char c) {
        if (c == '/' || c == 'c') {
            return 3;
        } else if (c == '+' || c == '-') {
            return 2;
        } else  if (c == '(') {
            return 1;
        } else if (c == ')') {
            return -1;
        }
        return 0;
    }

}
