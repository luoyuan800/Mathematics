/*
 * Fibonacci.java
 * Date: 28/12/2016
 * Time: 11:39 AM
 *
 * Copyright 2015 luoyuan.
 * ALL RIGHTS RESERVED.
*/
package cn.yuan.luo.fib;


import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * 各种姿势计算斐波拉契数列的任意位的数值
 */
public class Fibonacci {


    /**
     * 使用BigInteger实现迭代的方式计算斐波那契数
     * @param n 第几位的斐波那契数
     * @return 第N位的斐波那契数
     */
    public BigInteger calculateLinear(BigInteger n){
        BigInteger big1 = new BigInteger("1");
        BigInteger f0 = new BigInteger("0"), f1 = big1;
        for(BigInteger i = new BigInteger("0"); i.compareTo(n) == -1; i = i.add(big1)){
            f1 = f1.add(f0);
            f0 = f1.subtract(f0);
        }
        return f0;
    }

    /**
     * 迭代的方式计算斐波那契数
     * @param n 第几位的斐波那契数
     * @return 第N位的斐波那契数
     */
    public int calculateLinear(int n){
        int f0 = 0, f1 = f0 + 1;
        for(int i = 0; i< n; i++){
            f1 = f1 + f0;
            f0 = f1 - f0;
        }
        return f0;
    }

    /**
     * 精确计算任意位数的黄金比例
     * @param n 小数点后N位
     * @return 黄金比例的小数形式，包含N位小数。
     */
    public BigDecimal getGoldNumber(int n) {
        BigDecimal a = new BigDecimal(0.618);
        BigDecimal b = new BigDecimal("1");

        for (int i = 1; i < n + 1; i++) {
            a = b.divide(a.add(b), n, BigDecimal.ROUND_HALF_UP);
        }
        return a;
    }

    /**
     * 递归的方式计算斐波那契数，使用了额外的存储来减少递归次数
     * @param n 第几位的斐波那契数
     * @return 第N位的斐波那契数
     */
    public int calculateRecursion(int n){
        if(n < 2){
            return n;
        }
        Integer[] fibs = new Integer[n+1];
        fibs[0] = 0; fibs[1] = 1;
        fibs[n] = fibs[n]!=null ? fibs[n] : calculateRecursion(n -1) + calculateRecursion(n -2);
        return fibs[n];
    }

    /**
     * 普通递归的方式计算斐波那契数数
     * @param n 第几位的斐波那契数
     * @return 第N位的斐波那契数
     */
    public int calculateRecursionNotCache(int n){
        if(n < 2){
            return n;
        }
        return calculateRecursionNotCache(n -1) + calculateRecursionNotCache(n - 2);
    }
}
