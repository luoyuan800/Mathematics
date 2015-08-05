/*
 * QuadraticOfOneVariable.java
 * Date: 8/5/2015
 * Time: 11:24 AM
 * 
 * Copyright 2015 luoyuan.
 * ALL RIGHTS RESERVED.
*/

package equation;

public class QuadraticOfOneVariable {
    /**
     *求解一元二次方程的根
     * a<i>x</i><sup>2</sup> + b<i>x</i> + c =0<br>
     * <i>x</i> = [-b±√(b<i>x</i><sup>2</sup>-4ac)]/2a
     *
     * @param a 二次系数
     * @param b 一次系数
     * @param c 常数项
     * @return [-b+√(b<i>x</i><sup>2</sup>-4ac)]/2a, [-b-√(b<i>x</i><sup>2</sup>-4ac)]/2a
     */
    public static double[] solve(double a, double b, double c) {
        if(a==0) return new double[]{};//一次方程
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) return new double[]{};//无解
        double discSqrt = Math.sqrt(discriminant);
        double x1 = (-b + discSqrt) / (2 * a);
        double x2 = (-b - discSqrt) / (2 * a);
        return new double[]{x1, x2};
    }
}
