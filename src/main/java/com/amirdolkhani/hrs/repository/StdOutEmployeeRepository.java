package com.amirdolkhani.hrs.repository;

import com.amirdolkhani.hrs.entity.Employee;

import java.util.UUID;

public class StdOutEmployeeRepository {
    public Employee save(Employee employee) {

        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();
        System.out.println(" **********     Load employee Information       ********** ");
        System.out.println("Employee uniqe ID: " + randomUUIDString);
        System.out.println("Employee first name: " + employee.getName());
        System.out.println("Employee last name: " + employee.getLastName());
        System.out.println("Employee social security number: " + employee.getSocialSecurityNumber());
        System.out.println("Employee birthday: " + employee.getBirthday());
        System.out.println("Employee salary " + employee.getSalary() + "SEK");
        return employee;
    }
}
