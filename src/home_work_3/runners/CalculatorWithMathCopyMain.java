package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        double resalt;
        CalculatorWithMathCopy cwo = new CalculatorWithMathCopy();
        resalt = cwo.plusM(4.1, cwo.plusM(cwo.powM(cwo.divM(28, 5), 2), cwo.multM(15, 7)));
        System.out.println(resalt);
    }
}
