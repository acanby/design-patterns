package com.canby.iterator.model;

import java.math.BigDecimal;

/**
 * Created by acanby on 8/10/2014.
 */
public class Employee extends AbstractEmployee {
    String department;
    BigDecimal hourlyRate;

    public Employee(String employeeCode, String name, Address address, String department, BigDecimal hourlyRate) {
        super(employeeCode, name, address);
        this.department = department;
        this.hourlyRate = hourlyRate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department='" + department + '\'' +
                ", hourlyRate=" + hourlyRate +
                "} " + super.toString();
    }
}
