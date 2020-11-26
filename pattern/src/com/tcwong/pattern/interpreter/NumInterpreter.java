package com.tcwong.pattern.interpreter;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/11/26
 * Since 1.8
 */
public class NumInterpreter implements IArithmeticInterpreter {

    private int value;

    public NumInterpreter(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}
