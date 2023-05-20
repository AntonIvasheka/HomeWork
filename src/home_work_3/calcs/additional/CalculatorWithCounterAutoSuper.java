package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;


public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    long chek = 0;
    public long getCountOperation() {
        return chek;
    }
    public void incrementCountOperation() {
        chek += 1;
    }
    @Override
    public double powM (double a, double b) {
        incrementCountOperation();
        a = super.powM(a, b);
        return a;
    }
    @Override
    public double absM(double a)  {
        incrementCountOperation();
        a = super.absM(a);
        return a;
    }
    @Override
    public double sqrtM(double a) {
        incrementCountOperation();
        a = super.sqrtM(a);
        return a;
    }
    @Override
    public double plusM(double a, double b) {
        incrementCountOperation();
        a = super.plusM(a, b);
        return a;
    }
    @Override
    public double minusM(double a, double b) {
        incrementCountOperation();
        a = super.minusM(a, b);
        return a;
    }
    @Override
    public double divM(double a, double b) {
        incrementCountOperation();
        a = super.divM(a, b);
        return a;
    }
    @Override
    public double multM(double a, double b) {
        incrementCountOperation();
        a = super.multM(a, b);
        return a;
    }

}
