package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        double resalt;
        CalculatorWithCounterAutoChoiceAgregation CwcacA = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        resalt = CwcacA.plusM(4.1, CwcacA.plusM(CwcacA.powM(CwcacA.divM(28, 5), 2), CwcacA.multM(15, 7)));
        System.out.println(resalt);
        System.out.println();
        System.out.println(CwcacA.getCountOperation());
    }
}
