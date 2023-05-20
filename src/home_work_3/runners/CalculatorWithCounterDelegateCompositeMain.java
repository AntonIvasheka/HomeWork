package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        double resalt;
        CalculatorWithCounterAutoComposite cwcac = new CalculatorWithCounterAutoComposite();
        resalt = cwcac.plusM(4.1, cwcac.plusM(cwcac.powM(cwcac.divM(28, 5), 2), cwcac.multM(15, 7)));
        System.out.println(resalt);
        System.out.println();
        System.out.println(cwcac.getCountOperation());
    }


}
