package com.canby.iterator;

import com.canby.iterator.model.Employee;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import java.util.*;

public class EmployeeIteratorTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testNullArray() {
        Employee[] employees = null;
        EmployeeIterator iterator = new EmployeeIterator(employees);

        Assert.assertFalse(iterator.hasNext());

        expectedException.expect(NoSuchElementException.class);
        iterator.next();    // should give us the exception
    }

    @Test
    public void testNullCollection() {
        Collection<Employee> employees = null;
        EmployeeIterator iterator = new EmployeeIterator(employees);

        Assert.assertFalse(iterator.hasNext());

        expectedException.expect(NoSuchElementException.class);
        iterator.next();    // should give us the exception
    }

    @Test
    public void testEmptyArray() {
        Employee[] employees = new Employee[0];
        EmployeeIterator iterator = new EmployeeIterator(employees);

        Assert.assertFalse(iterator.hasNext());

        expectedException.expect(NoSuchElementException.class);
        iterator.next();    // should give us the exception
    }

    @Test
    public void testEmptyCollection() {
        List<Employee> employees = new ArrayList<>();
        EmployeeIterator iterator = new EmployeeIterator(employees);

        Assert.assertFalse(iterator.hasNext());

        expectedException.expect(NoSuchElementException.class);
        iterator.next();    // should give us the exception
    }

    @Test
    public void testRemoveNotImplemented() {
        EmployeeIterator iterator = new EmployeeIterator(new ArrayList<>());

        expectedException.expect(UnsupportedOperationException.class);
        iterator.remove();
    }

    @Test
    public void testIteratorOrdering() {
        Employee first = Mockito.mock(Employee.class);
        Employee second = Mockito.mock(Employee.class);
        Employee third = Mockito.mock(Employee.class);

        List<Employee> employeeCollection = Arrays.asList(first, second, third);
        EmployeeIterator iterator = new EmployeeIterator(employeeCollection);

        Assert.assertEquals(first, iterator.next());
        Assert.assertEquals(second, iterator.next());
        Assert.assertEquals(third, iterator.next());

        Collections.reverse(employeeCollection);
        iterator = new EmployeeIterator(employeeCollection);

        Assert.assertEquals(third, iterator.next());
        Assert.assertEquals(second, iterator.next());
        Assert.assertEquals(first, iterator.next());
    }

    @Test
    public void testNextCalculation() {
        Employee first = Mockito.mock(Employee.class);
        Employee second = Mockito.mock(Employee.class);
        Employee third = Mockito.mock(Employee.class);
        Employee fourth = Mockito.mock(Employee.class);
        Employee fifth = Mockito.mock(Employee.class);

        List<Employee> employeeCollection = Arrays.asList(first, second, third, fourth, fifth);
        EmployeeIterator iterator = new EmployeeIterator(employeeCollection);

        Assert.assertTrue(iterator.hasNext());
        Assert.assertNotNull(iterator.next());

        Assert.assertTrue(iterator.hasNext());
        Assert.assertNotNull(iterator.next());

        Assert.assertTrue(iterator.hasNext());
        Assert.assertNotNull(iterator.next());

        Assert.assertTrue(iterator.hasNext());
        Assert.assertNotNull(iterator.next());

        Assert.assertTrue(iterator.hasNext());
        Assert.assertNotNull(iterator.next());

        Assert.assertFalse(iterator.hasNext());
    }
}