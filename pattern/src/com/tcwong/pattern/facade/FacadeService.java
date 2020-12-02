package com.tcwong.pattern.facade;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/12/2
 * Since 1.8
 */
public class FacadeService {

    private MapSystemService mapSystemService = new MapSystemService();
    private PaySystemService paySystemService = new PaySystemService();
    private TripSystemService tripSystemService = new TripSystemService();

    public void doOut(User user) {
        tripSystemService.doTrip(user);
        mapSystemService.doMap(user);
        paySystemService.doPay(user);
    }
}
