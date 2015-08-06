/*
 * Cos.java
 * Date: 8/4/2015
 * Time: 5:26 PM
 * 
 * Copyright 2015 luoyuan.
 * ALL RIGHTS RESERVED.
*/

package triangle.cos;

public class Cos {

    /**
     * 根据角度求cos值
     *
     * @param angel 浮点型的角度
     */
    public static double cos(double angel) {
        return Math.cos(Math.toRadians(angel));
    }

    /**
     * 根据角度求cos值
     *
     * @param angel 整形的角度
     */
    public static double cos(int angel) {
        return cos((double) angel);
    }

    public static void main(String... args) {
        System.out.println(cos(45d));
    }
}
