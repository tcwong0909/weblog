package com.tcwong.pattern.interpreter;

import java.util.Stack;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/11/26
 * Since 1.8
 */
public class SelfCalculator {

    private Stack<IArithmeticInterpreter> stack = new Stack<>();
    public SelfCalculator(String expression) {
        parse(expression);
    }

    private void parse(String expression) {
        String[] elements = expression.split(" ");
        IArithmeticInterpreter left, right;
        for (int i = 0; i < elements.length; i++) {
            String operator = elements[i];
            if (OperatorUtil.ifOperator(operator)) {
                left = this.stack.pop();
                right = new NumInterpreter(Integer.valueOf(elements[++i]));
                System.out.println("出栈" + left.interpret() + "和" + right.interpret());
                this.stack.push(OperatorUtil.getInterpreter(left, right, operator));
                System.out.println("应用运算符:" + operator);
            } else {
                NumInterpreter numInterpreter = new NumInterpreter(Integer.valueOf(elements[i]));
                stack.push(numInterpreter);
                System.out.println("入栈:" + numInterpreter.interpret());
            }
        }

    }

    public int calculate() {
        return this.stack.pop().interpret();
    }
}
