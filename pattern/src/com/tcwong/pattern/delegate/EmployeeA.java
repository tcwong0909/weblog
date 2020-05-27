package com.tcwong.pattern.delegate;

public class EmployeeA implements IEmployee {

    @Override
    public void doThing(String command) {
        System.out.println("JAVA工程师,"+"进行"+command+"优化");
    }
}
