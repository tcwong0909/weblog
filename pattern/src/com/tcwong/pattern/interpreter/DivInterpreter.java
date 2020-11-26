package com.tcwong.pattern.interpreter;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/11/26
 * Since 1.8
 */
public class DivInterpreter extends Interpreter {
    public DivInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return this.left.interpret() / this.right.interpret();
    }
}
