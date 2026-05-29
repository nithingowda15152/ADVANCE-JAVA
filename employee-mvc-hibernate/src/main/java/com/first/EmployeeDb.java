package com.first;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

@Component
public class EmployeeDb {

    @Autowired
    EntityManagerFactory emf;

    public void saveEmployee(Employee emp) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(emp);
        et.commit();

        em.close();
    }

    public void updateEmployee(Employee emp) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.merge(emp);
        et.commit();

        em.close();
    }

    public void deleteEmployee(Employee emp) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        emp = em.contains(emp) ? emp : em.merge(emp);
        em.remove(emp);
        et.commit();

        em.close();
    }

    public Employee findEmployeeById(int id) {
        EntityManager em = emf.createEntityManager();
        Employee emp = em.find(Employee.class, id);
        em.close();
        return emp;
    }

    public List<Employee> findAllEmployee() {
        EntityManager em = emf.createEntityManager();

        Query q = em.createQuery("select e from Employee e");
        List<Employee> list = q.getResultList();

        em.close();
        return list;
    }
}