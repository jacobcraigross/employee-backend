package dev.jakeross.employeeapi.services;
import dev.jakeross.employeeapi.model.Employee;
import java.util.List;



public interface EmployeeService {
    Employee createEmployee(Employee employee);
    List<Employee> getAllEmployees();
    boolean deleteEmployee(Long id);
}
