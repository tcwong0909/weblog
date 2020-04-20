package com.tcwong.pattern.principle.law;

import java.util.ArrayList;
import java.util.List;

public class Leader {

    public Integer getManagerNum(Manager manager) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee());
        employees.add(new Employee());
        return manager.countEmployeeNum(employees);
    }
}
