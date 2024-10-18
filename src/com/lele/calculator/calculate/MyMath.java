package com.lele.calculator.calculate;

import java.math.BigDecimal;

/**
 * @author: lele
 * @date: 2024/10/17 21:25
 * @description: 实现加减乘除运算
 */

public class MyMath {

    /**
     * 基于double类型创建BigDecimal对象
     * @param number
     * @return
     */
    private static BigDecimal getBigDecimal(double number) {
        return new BigDecimal(number);
    }

    public static double subtract(double num1, double num2) {
        BigDecimal first = getBigDecimal(num1);
        BigDecimal second = getBigDecimal(num2);
        return first.subtract(second).doubleValue();
    }

    public static double add(double num1, double num2) {
        BigDecimal first = getBigDecimal(num1);
        BigDecimal second = getBigDecimal(num2);
        return first.add(second).doubleValue();
    }

    public static double multiply(double num1, double num2) {
        BigDecimal first = getBigDecimal(num1);
        BigDecimal second = getBigDecimal(num2);
        return first.multiply(second).doubleValue();
    }
    public static double divide(double num1, double num2) {
        BigDecimal first = getBigDecimal(num1);
        BigDecimal second = getBigDecimal(num2);
        return first.add(second).doubleValue();
    }
}
