/*
 * ArcSin.java
 * Date: 8/6/2015
 * Time: 9:36 AM
 * 
 * Copyright 2015 luoyuan.
 * ALL RIGHTS RESERVED.
*/

package triangle.sin;

public class ArcSin {
    /**
     * 反三角函数计算<br>
     * 计算反正弦
     * @param value 正弦值，取值范围为[-1,1]
     * @return 角度
     */
    public static double arcsin(double value){
        return Math.toDegrees(Math.asin(value));
    }
}
