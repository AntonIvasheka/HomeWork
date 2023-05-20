package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;


public class CalculatorWithCounterAutoComposite {
    CalculatorWithMathCopy cwmc = new CalculatorWithMathCopy();
    long chek = 0;
    public long getCountOperation() {
        return chek;
    }
    public void incrementCountOperation() {
        chek += 1;
    }

    public double plusM(double a, double b) {
        incrementCountOperation();
        return cwmc.plusM(a, b);
    }

    public double minusM(double a, double b) {
        incrementCountOperation();
        return cwmc.minusM(a, b);
    }

    public double divM(double a, double b) {
        incrementCountOperation();
        return cwmc.divM(a, b);
    }

    public double multM(double a, double b) {
        incrementCountOperation();
        return cwmc.multM(a, b);
    }

    public double powM(double a, double b) {
        incrementCountOperation();
        return cwmc.powM(a, b);
    }
    public double absM(double a)  {
        incrementCountOperation();
        return cwmc.absM(a);
    }
    public double sqrtM(double a) {
        incrementCountOperation();
        return cwmc.sqrtM(a);
    }


}
