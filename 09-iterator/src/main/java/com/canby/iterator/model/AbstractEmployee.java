package com.canby.iterator.model;

/**
 * Created by acanby on 8/10/2014.
 */
public abstract class AbstractEmployee {
    String employeeCode;
    String name;
    Address address;

    protected AbstractEmployee(String employeeCode, String name, Address address) {
        this.employeeCode = employeeCode;
        this.name = name;
        this.address = address;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "AbstractEmployee{" +
                "employeeCode='" + employeeCode + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}