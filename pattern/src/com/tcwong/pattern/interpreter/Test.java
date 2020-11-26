package com.tcwong.pattern.interpreter;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/11/26
 * Since 1.8
 */
public class Test {
    public static void main(String[] args) {
        String expression = "10 + 40 - 20";
        int resultCalculate = new SelfCalculator(expression).calculate();
        System.err.println("表达式：" + expression);
        System.err.println("计算结果："+resultCalculate);
    }
}
