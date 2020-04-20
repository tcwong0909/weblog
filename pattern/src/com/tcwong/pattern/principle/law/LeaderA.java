package com.tcwong.pattern.principle.law;

public class LeaderA {

    public Integer getManagerNum(ManagerA manager) {

        return manager.countEmployeeNum();
    }
}
