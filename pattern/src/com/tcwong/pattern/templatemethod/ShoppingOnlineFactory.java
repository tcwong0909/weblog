package com.tcwong.pattern.templatemethod;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ShoppingOnlineFactory {
    public static String TAOBAO = "TAOBAO";
    public static String JINGDONG = "JINGDONG";
    public static String PINDUODUO = "PINDUODUO";
    public static String DANGDANG = "DANGDANG";

    private Map<String, DoShopping> shoppingMap = new ConcurrentHashMap<>();

    public ShoppingOnlineFactory() {
        shoppingMap.put(TAOBAO, new TaoBaoShopping());
        shoppingMap.put(JINGDONG, new JingDongShopping());
        shoppingMap.put(PINDUODUO, new PinDuoDuoShopping());
        shoppingMap.put(DANGDANG, new DangDangShopping());
    }

    /**
     * 选择货物来源
      * @param shoppingType 来源类型
     * @return
     */
    public DoShopping getShoppingLine(String shoppingType) {
        shoppingType = shoppingType == null ? TAOBAO : shoppingType;
        DoShopping doShopping = shoppingMap.get(shoppingType);
        return doShopping == null ? shoppingMap.get(TAOBAO) : doShopping;
    }

}
