package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        double resalt;
        CalculatorWithCounterAutoChoiceAgregation cwcaca = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        resalt = cwcaca.plusM(4.1, cwcaca.plusM(cwcaca.powM(cwcaca.divM(28, 5), 2), cwcaca.multM(15, 7)));
        System.out.println(resalt);
        System.out.println();
        System.out.println(cwcaca.getCountOperation());
    }
}
