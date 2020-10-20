package com.tcwong.pattern.decorator;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/10/12
 * Since 1.8
 */
public class ConditionerRoomDecorator extends AbstractRoomDecorator {
    public ConditionerRoomDecorator(AbstractRoom abstractRoom) {
        super(abstractRoom);
    }

    @Override
    String addFurniture() {
        String msg = "安装一台空调";
        return msg;
    }

    @Override
    Integer getTotalCost() {
        Integer totalCost = super.getTotalCost() + 10000;
        return totalCost;
    }
}
