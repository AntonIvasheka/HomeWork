package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic cwcc = new CalculatorWithCounterClassic();
        double resalt;
        double tmp;
        resalt = cwcc.divM(28, 5);
        cwcc.incrementCountOperation();
        resalt = cwcc.powM(resalt, 2);
        cwcc.incrementCountOperation();
        tmp = resalt;
        resalt = cwcc.multM(15, 7);
        cwcc.incrementCountOperation();
        resalt = cwcc.plusM(resalt, tmp);
        cwcc.incrementCountOperation();
        resalt = cwcc.plusM(4.1, resalt);
        cwcc.incrementCountOperation();
        System.out.println(resalt);
        System.out.println(cwcc.getCountOperation());
    }
}
