package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {

    public static void main(String[] args) {
        double resalt;
        CalculatorWithCounterAutoSuper cwca = new CalculatorWithCounterAutoSuper();
        resalt = cwca.plusM(4.1, cwca.plusM(cwca.powM(cwca.divM(28, 5), 2), cwca.multM(15, 7)));
        System.out.println(resalt);
        System.out.println();
        System.out.println(cwca.getCountOperation());
    }
}
