package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        double resalt;
        CalculatorWithCounterAutoComposite Cwcac = new CalculatorWithCounterAutoComposite();
        resalt = Cwcac.plusM(4.1, Cwcac.plusM(Cwcac.powM(Cwcac.divM(28, 5), 2), Cwcac.multM(15, 7)));
        System.out.println(resalt);
        System.out.println();
        System.out.println(Cwcac.getCountOperation());
    }


}
