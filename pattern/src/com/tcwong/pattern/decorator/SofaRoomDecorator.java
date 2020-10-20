package com.tcwong.pattern.decorator;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/10/12
 * Since 1.8
 */
public class SofaRoomDecorator extends AbstractRoomDecorator {

    public SofaRoomDecorator(AbstractRoom abstractRoom) {
        super(abstractRoom);
    }

    @Override
    String addFurniture() {
        String msg = "装修一台沙发";
        return msg;
    }

    @Override
    Integer getTotalCost() {
        Integer totalCost = super.getTotalCost() + 5000;
        return totalCost;
    }

}
