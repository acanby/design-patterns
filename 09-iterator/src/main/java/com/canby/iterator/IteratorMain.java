package com.canby.iterator;


import com.canby.iterator.model.Address;
import com.canby.iterator.model.Employee;
import com.canby.iterator.model.Manager;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 * Created by acanby on 8/10/2014.
 */
public class IteratorMain {
    public static void main(String[] args) {

        Employee bobSmith = new Employee("bob-123", "Bob Smith", new Address(1, "Main Street", "Wollongong", "Australia", 2500), "IT", new BigDecimal(24.50));
        Employee samBlack = new Employee("sam-999", "Sam Black", new Address(233, "Reid Street", "Oak Flats", "Australia", 2529), "Admin", new BigDecimal(22.09));
        Employee reggieOscar = new Employee("reggie-987", "Reggie Oscar", new Address(34, "Campbell Parade", "Woonona", "Australia", 2517), "Systems Architect", new BigDecimal(33.90));

        Manager terryReynolds = new Manager("manager-123", "Terry Reynolds", new Address(11, "Kiera Street", "Wollongong", "Australia", 2500), "Branch Manager", new BigDecimal(64.90));

        Stream.of(bobSmith, samBlack, reggieOscar).forEach(terryReynolds::addUnderling);

        Iterator<Employee> iterator = terryReynolds.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}





