package com.canby.iterator;

import com.canby.iterator.model.Employee;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * An iterator for Employees
 */
public class EmployeeIterator implements Iterator<Employee> {
    private int currentPosition = 0;
    final Employee[] employees;

    /**
     * Create an iterator for an array
     *
     * @param employees an array of Employees
     */
    public EmployeeIterator(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * Create an iterator for a {@link java.util.Collection}.
     *
     * Ordering of elements is the same as that of the collection passed in.
     *
     * @param employeeCollection collection to iterate over.
     */
    public EmployeeIterator(Collection<Employee> employeeCollection) {
        if (employeeCollection == null) {
            this.employees = null;
        } else {
            this.employees = employeeCollection.toArray(new Employee[employeeCollection.size()]);
        }
    }

    @Override
    public boolean hasNext() {
        return employees != null && currentPosition < employees.length;
    }

    @Override
    public Employee next() {
        if (employees == null || currentPosition >= employees.length) {
            throw new NoSuchElementException();
        }

        return employees[currentPosition++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

