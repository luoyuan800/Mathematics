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
    public static int sin(int angel) {
        Long round = Math.round(Math.sin((Math.toRadians(angel) * 100d)));
        return round.intValue();
    }

    public static double sin(double angel) {
        Double round = Math.sin((Math.toRadians(angel)));
        return round;
    }

    public static void main(String... args) {
        System.out.println(sin(45d));
    }
}
