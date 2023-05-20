package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

import static java.lang.Math.*;

public class CalculatorWithCounterAutoComposite {
    CalculatorWithMathCopy Cwmc = new CalculatorWithMathCopy();
    long chek = 0;
    public long getCountOperation() {
        return chek;
    }
    public void incrementCountOperation() {
        chek += 1;
    }

    public double plusM(double a, double b) {
        incrementCountOperation();
        return Cwmc.plusM(a, b);
    }

    public double minusM(double a, double b) {
        incrementCountOperation();
        return Cwmc.minusM(a, b);
    }

    public double divM(double a, double b) {
        incrementCountOperation();
        return Cwmc.divM(a, b);
    }

    public double multM(double a, double b) {
        incrementCountOperation();
        return Cwmc.multM(a, b);
    }

    public double powM(double a, double b) {
        incrementCountOperation();
        return Cwmc.powM(a, b);
    }
    public double absM(double a)  {
        incrementCountOperation();
        return Cwmc.absM(a);
    }
    public double sqrtM(double a) {
        incrementCountOperation();
        return Cwmc.sqrtM(a);
    }


}
