package com.tcwong.pattern.facade;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/12/2
 * Since 1.8
 */
public class TripSystemService {

    public void doTrip(User user) {
        System.out.println(user.getName() + ">>>>出行");
    }
}
