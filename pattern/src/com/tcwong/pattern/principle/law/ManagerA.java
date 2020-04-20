package com.tcwong.pattern.principle.law;

import java.util.ArrayList;
import java.util.List;

public class ManagerA {

    public Integer countEmployeeNum() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee());
        employees.add(new Employee());
        return employees.size();
    }
}
