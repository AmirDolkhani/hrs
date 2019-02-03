package com.amirdolkhani.hrs;

import com.amirdolkhani.hrs.entity.Employee;
import com.amirdolkhani.hrs.interactive.EmployeeDataSource;
import com.amirdolkhani.hrs.repository.MySQLEmployeeRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        EmployeeDataSource employeeDataSource = new EmployeeDataSource();


        Employee employee = employeeDataSource.getEmployeeInformation();

        //StdOutEmployeeRepository stdOutEmployeeRepository = new StdOutEmployeeRepository();
        //stdOutEmployeeRepository.save(employee);

        MySQLEmployeeRepository mySQLEmployeeRepository = new MySQLEmployeeRepository();
        mySQLEmployeeRepository.save(employee);

    }
}


// Show information on console
// Save inform in stdout employee
