package interfaces;


import models.Employee;

import java.util.List;

public interface IEmployee {
    public void save (Employee employee);
    public Employee getEmployee (Long id);
    public void update (Employee employee);
    public void delete (Employee employee);
    public List<Employee> getEmployees();
}

