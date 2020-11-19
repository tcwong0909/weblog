package com.tcwong.pattern.state;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/11/15
 * Since 1.8
 */
public class Test {
    public static void main(String[] args) {
        AppContext appContext = new AppContext();
        appContext.favorite();
        appContext.comment("五星好评！！！！");
    }
}
