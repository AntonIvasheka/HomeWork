package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {

    public static void main(String[] args) {
        double resalt;
        CalculatorWithCounterAutoSuper CwcA = new CalculatorWithCounterAutoSuper();
        resalt = CwcA.plusM(4.1, CwcA.plusM(CwcA.powM(CwcA.divM(28, 5), 2), CwcA.multM(15, 7)));
        System.out.println(resalt);
        System.out.println();
        System.out.println(CwcA.getCountOperation());
    }
}
