package com.amirdolkhani.hrs.repository;

import com.amirdolkhani.hrs.entity.Employee;

import java.sql.*;
import java.util.UUID;
public class MySQLEmployeeRepository {

    public Employee save(Employee employee) {
        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();

        try
        {
            String url = "jdbc:mysql://18.202.69.163:3306/amiralidb";
            String user = "amirali";
            String password = "password";

            Connection myConn = null;
            PreparedStatement myStmt = null;
            ResultSet myRs = null;

            // 1: Get a connection to datsbase
            myConn = DriverManager.getConnection(url, user, password);
            // 2: Create a prepared   statement
            myStmt = myConn.prepareStatement("INSERT into employee VALUES(?, ?, ?, ?, ?, ?");
            // 3: Set the parameters
            myStmt.setString(1,randomUUIDString);
            myStmt.setString(2,employee.getName());
            myStmt.setString(3,employee.getLastName());
            myStmt.setString(4,employee.getSocialSecurityNumber());
            myStmt.setString(4,employee.getBirthday());
            myStmt.setDouble(5,employee.getSalary());
            // 4: Execute SQL query
            myRs = myStmt.executeQuery();



        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return employee;
    }
}
