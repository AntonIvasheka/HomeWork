package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        double resalt;
        CalculatorWithCounterAutoAgregation CwcaA = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());
        resalt = CwcaA.plusM(4.1, CwcaA.plusM(CwcaA.powM(CwcaA.divM(28, 5), 2), CwcaA.multM(15, 7)));
        System.out.println(resalt);
        System.out.println();
        System.out.println(CwcaA.getCountOperation());
    }
}
