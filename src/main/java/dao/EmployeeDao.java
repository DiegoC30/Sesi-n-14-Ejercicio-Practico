package dao;

import interfaces.IEmployee;
import jakarta.persistence.EntityManager;
import models.Employee;

import java.util.List;


public class EmployeeDao implements IEmployee  {
    @Override
    public void save(Employee employee) {
        EntityManager es = EntityManagerAdmin.getInstance();
        es.getTransaction().begin();
        es.persist(employee);
        es.getTransaction().commit();
    }

    @Override
    public Employee getEmployee(Long id) {
        EntityManager es = EntityManagerAdmin.getInstance();
        return null;
    }

    @Override
    public void update(Employee employee) {
        EntityManager es = EntityManagerAdmin.getInstance();
        es.getTransaction().begin();
        es.merge(employee);
        es.getTransaction().commit();
    }

    @Override
    public void delete(Employee employee) {
        EntityManager es = EntityManagerAdmin.getInstance();
        es.getTransaction().begin();
        es.remove(employee);
        es.getTransaction().commit();
    }

    @Override
    public List<Employee> getEmployees() {
        return List.of();
    }
}
