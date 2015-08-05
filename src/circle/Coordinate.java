/*
 * Coordinate.java
 * Date: 8/5/2015
 * Time: 9:09 AM
 * 
 * Copyright 2015 luoyuan.
 * ALL RIGHTS RESERVED.
*/

package circle;

import round.Round;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.toRadians;

public class Coordinate {
    /**
     * 计算圆上任意一点的坐标，根据圆心坐标，半径， 和X正轴的圆心夹角。
     * @param x 圆心坐标x
     * @param y 圆心坐标y
     * @param r 圆半径
     * @param angle 与X正轴的夹角
     * @return 在圆上的端点坐标
     */
    public static double[] circleCoordinate(double x, double y, double r, double angle) {
        Double x1 = x + r * cos(toRadians(angle));
        Double y1 = y + r * sin(toRadians(angle));
        return new double[]{x1, y1};
    }

    /**
     * 计算圆上任意一点的坐标，根据圆心坐标，半径， 和X正轴的圆心夹角。
     * 这个方法根据四舍五入返回整形的数值
     * @param x 圆心坐标x
     * @param y 圆心坐标y
     * @param r 圆半径
     * @param angle 与X正轴的夹角
     * @return 在圆上的端点坐标
     */
    public static Long[] circleCoordinate(long x, long y, long r, long angle) {
        Double x1 = x + r * cos(toRadians(angle));
        Double y1 = y + r * sin(toRadians(angle));
        return new Long[]{Round.roundToLong(x1), Round.roundToLong(y1)};
    }

    /**
     * 判断一个坐标是否在给定圆的内部
     * @param circleX 圆心坐标X
     * @param circleY 圆心坐标Y
     * @param circleR 圆的半径
     * @param x 给定点的坐标X
     * @param y 给定点的坐标Y
     * @return true 如果坐标落在圆的内部， 否则返回false
     */
    public static boolean insideCircle(double circleX, double circleY, double circleR, double x, double y){
        return Math.hypot(circleX - x, circleY -y) <= circleR;
    }

    public static void main(String...args){
        System.out.println(Math.hypot(-2, 2));
    }
}
