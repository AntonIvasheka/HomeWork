package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends cwmt = new CalculatorWithMathExtends();
        double resalt;
        resalt = cwmt.plusM(4.1, cwmt.plusM(cwmt.powM(cwmt.divM(28, 5), 2), cwmt.multM(15, 7)));
        System.out.println(resalt);

    }
}
