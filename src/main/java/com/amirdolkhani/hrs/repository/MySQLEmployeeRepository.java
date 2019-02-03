package com.amirdolkhani.hrs.repository;

import com.amirdolkhani.hrs.entity.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;
public class MySQLEmployeeRepository {

    public Employee save(Employee employee) {
        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();

        try
        {
            String url = "jdbc:mysql://18.202.69.163:3306/amiralidb?";
            String user = "amirali";
            String password = "password";

            // 1: Get a connection to datsbase
            Connection myConn = DriverManager.getConnection(url, user, password);
            // 2: Create a statement
            Statement myStmt = myConn.createStatement();
            //3: Excecute MySQL query
            String sql = "INSERT into employee (?, ?, ?, ?, ?, ?) "
                         + "VALUES()";

        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }

       // INSERT INTO employee ( id, name, lastName, socialSecurityNumber, birthday, salary);
       // VALUES
            (employee.getName() ,employee.getLastName(), employee.getSocialSecurityNumber(), employee.getBirthday(), employee.getSalary(), "");
        return employee;
    }
}
