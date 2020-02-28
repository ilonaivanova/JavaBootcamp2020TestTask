package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class EmployeeTest extends TestCase {

    public void checkEmployeeCreatedProperly() {
        Employee employee = new Employee();
        employee.setName("Dima");
        employee.setAge(37);
        employee.setCompany("Opel");
        employee.setJobTitle("Sales Manager");

        assertEquals("I am an error message", "Dima", employee.getFirstName());
        assertThat(employee.getAge(), is(37));
        assertThat(employee.getName(), is("Dima"));
        assertThat(employee.getCompany(), is("Opel"));
        assertThat(employee.getJobTitle(), is("Sales Manager"));

    }
}