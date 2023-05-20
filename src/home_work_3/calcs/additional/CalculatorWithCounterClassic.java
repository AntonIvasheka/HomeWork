package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    public int chek =0;
    public void incrementCountOperation() {
        chek += 1;
    }
    public long getCountOperation() {
        return chek;
    }
}
