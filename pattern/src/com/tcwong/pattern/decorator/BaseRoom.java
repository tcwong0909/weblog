package com.tcwong.pattern.decorator;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/10/12
 * Since 1.8
 */
public class BaseRoom extends AbstractRoom {
    @Override
    String addFurniture() {
        String msg = "毛坯房";
        return msg;
    }

    @Override
    Integer getTotalCost() {
        Integer cost = 100000;
        return cost;
    }
}
