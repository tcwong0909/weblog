package com.tcwong.pattern.decorator;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/10/12
 * Since 1.8
 */
public abstract class AbstractRoomDecorator extends AbstractRoom {

    private AbstractRoom abstractRoom;

    public AbstractRoomDecorator(AbstractRoom abstractRoom) {
        this.abstractRoom = abstractRoom;
    }

    @Override
    String addFurniture() {
        return abstractRoom.addFurniture();
    }

    @Override
    Integer getTotalCost() {
        return abstractRoom.getTotalCost();
    }
}
