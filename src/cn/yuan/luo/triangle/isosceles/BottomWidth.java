/*
 * BottomWidth.java
 * Date: 8/4/2015
 * Time: 11:26 AM
 * 
 * Copyright 2015 luoyuan.
 * ALL RIGHTS RESERVED.
 * 求等腰三角形的底边长度
*/

package cn.yuan.luo.triangle.isosceles;

import static java.lang.Math.cos;
import static java.lang.Math.sqrt;
import static java.lang.Math.toRadians;

public class BottomWidth {
    /**
     * 一只腰长，顶角度数，求等腰三角形底边长度
     * 返回int类型不精确的数据
     *
     * @param isosceles 腰边长
     * @param angle     顶角度数
     * @return 底边长度
     */
    public static int isoscelesTriangleBottomWidth(int isosceles, int angle) {
        Double sqrt = sqrt(2 * (1 - Math.round(cos(toRadians(angle)) * 100)));
        Double width = isosceles * sqrt;
        return width.intValue();
    }

    /**
     * 一只腰长，顶角度数，求等腰三角形底边长度
     * 返回int类型不精确的数据
     *
     * @param isosceles 腰边长
     * @param angle     顶角度数
     * @return 底边长度
     */
    public static double isoscelesTriangleBottomWidth(double isosceles, double angle) {
        Double sqrt = sqrt(2d * (1d - cos(toRadians(angle) * 100d)));
        return isosceles * sqrt;
    }


}
