package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

import static java.lang.Math.*;

public class CalculatorWithCounterAutoAgregation {
    long chek = 0;
    public long getCountOperation() {
        return chek;
    }
    public void incrementCountOperation() {
        chek += 1;
    }
    private CalculatorWithMathCopy ConstMathCopy;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy ConstMathCopy) {
         this.ConstMathCopy = ConstMathCopy;
    }
    public double plusM(double a, double b) {
        incrementCountOperation();
        return ConstMathCopy.plusM(a, b);
    }

    public double minusM(double a, double b) {
        incrementCountOperation();
        return ConstMathCopy.minusM(a, b);
    }

    public double divM(double a, double b) {
        incrementCountOperation();
        return ConstMathCopy.divM(a, b);
    }

    public double multM(double a, double b) {
        incrementCountOperation();
        return ConstMathCopy.multM(a, b);
    }

    public double powM(double a, double b) {
        incrementCountOperation();
        return ConstMathCopy.powM(a, b);
    }
    public double absM(double a)  {
        incrementCountOperation();
        return ConstMathCopy.absM(a);
    }
    public double sqrtM(double a) {
        incrementCountOperation();
        return ConstMathCopy.sqrtM(a);
    }
    }


