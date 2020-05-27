package com.tcwong.pattern.delegate;

public class EmployeeB implements IEmployee {

    @Override
    public void doThing(String command) {
        System.out.println("H5工程师,"+"进行"+command+"优化");
    }
}
