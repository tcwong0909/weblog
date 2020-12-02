package com.tcwong.pattern.facade;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/12/2
 * Since 1.8
 */
public class MapSystemService {

    public void doMap(User user) {
        System.out.println(user.getName() + ">>>>使用地图");
    }
}
