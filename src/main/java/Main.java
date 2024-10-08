import dao.EmployeeDao;
import models.Employee;

public class Main {
    public static void main(String[] args) {
        // Create an instance of EmployeeDao to handle employee operations
        EmployeeDao daoEmployee = new EmployeeDao(); // Use camel case for variable name

        // Create an Employee object and set its attributes
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("John Doe");
        employee.setDepartment("Software Developer");


        daoEmployee.save(employee);

        System.out.println("Employee saved: " + employee.getName());
    }
}
