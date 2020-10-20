package com.tcwong.pattern.decorator;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/10/12
 * Since 1.8
 */
public class Test {
    public static void main(String[] args) {
        AbstractRoom room = new BaseRoom();
        System.out.println(room.addFurniture()+room.getTotalCost());
        room = new SofaRoomDecorator(room);
        System.out.println(room.addFurniture()+room.getTotalCost());
        room = new ConditionerRoomDecorator(room);
        System.out.println(room.addFurniture()+room.getTotalCost());
        room = new ConditionerRoomDecorator(room);
        System.out.println(room.addFurniture()+room.getTotalCost());
        room = new SofaRoomDecorator(room);
        System.out.println(room.addFurniture()+room.getTotalCost());
    }
}
