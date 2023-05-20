package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        double resalt;
        CalculatorWithOperator cwo = new CalculatorWithOperator();
        resalt = cwo.plusM(4.1, cwo.plusM(cwo.powM(cwo.divM(28, 5), 2), cwo.multM(15, 7)));
        System.out.println(resalt);
    }
}
