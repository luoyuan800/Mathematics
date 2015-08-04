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
    public static double cos(double angel){
        return Math.cos(Math.toRadians(angel));
    }

    public static int cos(int angel){
        Double cos = cos((double)angel);
        return cos.intValue();
    }

    public static void main(String...args){
        System.out.println(cos(45d));
    }
}
