package com.canby.iterator.model;

import com.canby.iterator.EmployeeIterator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by acanby on 8/10/2014.
 */
public class Manager extends Employee {
    final List<Employee> underlings;

    public Manager(String employeeCode, String name, Address address, String department, BigDecimal hourlyRate, List<Employee> underlings) {
        super(employeeCode, name, address, department, hourlyRate);
        this.underlings = underlings;
    }

    public Manager(String employeeCode, String name, Address address, String department, BigDecimal hourlyRate) {
        super(employeeCode, name, address, department, hourlyRate);
        this.underlings = new ArrayList<>();
    }

    public List<Employee> getUnderlings() {
        return underlings;
    }

    public void addUnderling(Employee employee) {
        underlings.add(employee);
    }

    public void clearUnderlings() {
        underlings.clear();
    }

    public Iterator<Employee> createIterator() {
        return new EmployeeIterator(underlings.toArray(new Employee[underlings.size()]));
    }

    @Override
    public String toString() {
        return "Manager{" +
                "underlings=" + underlings +
                "} " + super.toString();
    }
}
