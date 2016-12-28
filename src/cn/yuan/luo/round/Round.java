/*
 * Round.java
 * Date: 8/4/2015
 * Time: 2:54 PM
 * 
 * Copyright 2015 luoyuan.
 * ALL RIGHTS RESERVED.
*/

package cn.yuan.luo.round;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Round {

    /**
     * 使用BigDecimal，保留小数点后n位数
     *
     * @param value 需要进行四舍五入的数字
     * @param scale 精度（保留小数点后几位）
     * @return 数字文本
     */
    public static String bigDecimalRound(double value, int scale) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(scale, RoundingMode.HALF_UP);
        return bd.toString();
    }

    /**
     * 使用DecimalFormat，保留小数点后n位数
     *
     * @param value 需要进行四舍五入的数字
     * @param scale 精度（保留小数点后几位）
     * @return 数字文本
     */
    public static String DecimalFormatRound(double value, int scale) {
        StringBuilder sb = new StringBuilder("0");
        if (scale > 0) {
            sb.append(".");
            while (scale > 0) {
                sb.append("0");
                scale--;
            }
        }
        DecimalFormat df = new DecimalFormat(sb.toString());
        df.setRoundingMode(RoundingMode.HALF_UP);
        return df.format(value);

    }

    /**
     * 使用NumberFormat，保留小数点后n位数
     *
     * @param value 需要进行四舍五入的数字
     * @param scale 精度（保留小数点后几位）
     * @return 数字文本
     */
    public static String numberFormatRound(double value, int scale) {
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setRoundingMode(RoundingMode.HALF_UP);
        nf.setMaximumFractionDigits(scale);
        nf.setMinimumFractionDigits(scale);
        nf.setGroupingUsed(false);
        return nf.format(value);

    }

    /**
     * 四舍五入成整数
     *
     * @param value 含小数位的数值
     * @return 短整数
     */
    public static int roundToInt(double value) {
        return Integer.parseInt(bigDecimalRound(value, 0));
    }

    /**
     * 四舍五入成整数
     *
     * @param value 含小数位的数值
     * @return 长整数
     */
    public static long roundToLong(double value) {
        return Long.parseLong(bigDecimalRound(value, 0));
    }

    public static void main(String... args) {
        System.out.println(DecimalFormatRound(11.3333, 0));
    }
}
