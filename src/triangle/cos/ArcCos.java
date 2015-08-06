/*
 * ArcCos.java
 * Date: 8/6/2015
 * Time: 9:07 AM
 * 
 * Copyright 2015 luoyuan.
 * ALL RIGHTS RESERVED.
*/

package triangle.cos;

public class ArcCos {
    /**
     * 反三角函数计算<br>
     * 计算反余弦
     * @param value 余弦值，取值范围为[-1,1]
     * @return 角度
     */
    public static double arccos(double value){
        return Math.toDegrees(Math.acos(value));
    }

    public static void main(String...args){
        System.out.println(arccos(1.7));
    }
}
