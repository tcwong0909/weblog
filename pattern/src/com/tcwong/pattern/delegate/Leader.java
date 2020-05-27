package com.tcwong.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

public class Leader {

    private Map<String, IEmployee> leadEmployees = new HashMap<>();

    public Leader() {
        leadEmployees.put("服务器", new EmployeeA());
        leadEmployees.put("界面", new EmployeeB());
    }

    public void command(String command) {
        leadEmployees.get(command).doThing(command);
    }
}
