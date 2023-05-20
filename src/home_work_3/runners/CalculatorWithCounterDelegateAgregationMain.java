package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        double resalt;
        CalculatorWithCounterAutoAgregation cwcaa = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());
        resalt = cwcaa.plusM(4.1, cwcaa.plusM(cwcaa.powM(cwcaa.divM(28, 5), 2), cwcaa.multM(15, 7)));
        System.out.println(resalt);
        System.out.println();
        System.out.println(cwcaa.getCountOperation());
    }
}
