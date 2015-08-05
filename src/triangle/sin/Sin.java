/*
 * Sin.java
 * Date: 8/4/2015
 * Time: 11:44 AM
 * 
 * Copyright 2015 luoyuan.
 * ALL RIGHTS RESERVED.
*/

package triangle.sin;

public class Sin {
    /**
     * 根据角度求sin值
     * @param angel 浮点型的角度
     **/
    public static double sin(int angel) {
        return Math.sin(Math.toRadians(angel));
    }

    /**
     * 根据角度求sin值
     * @param angel 浮点型的角度
     **/
    public static double sin(double angel) {
        return Math.sin((Math.toRadians(angel)));
    }

    public static void main(String... args) {
        System.out.println(sin(45));
    }
}
