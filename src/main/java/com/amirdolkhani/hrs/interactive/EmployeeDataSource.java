package  com.amirdolkhani.hrs.interactive;

import com.amirdolkhani.hrs.entity.Employee;

import java.util.Scanner;

public class EmployeeDataSource{

    public Employee getEmployeeInformation(){

        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);

        System.out.println("***********       Welcome to Human Resource System        ***********");

       /* String id = "A1";
        employee.setId(id);*/

        System.out.println("Please Enter your name: ");
        String name = scanner.nextLine();
        employee.setName(name);

        System.out.println("Please enter your last name: ");
        String lastName = scanner.nextLine();
        employee.setLastName(lastName);

        System.out.println("Please enter your social security number: ");
        String socialSecurityNumber = scanner.nextLine();
        employee.setSocialSecurityNumber(socialSecurityNumber);

        System.out.println("Please enter your birthday: ");
        String birthday = scanner.nextLine();
        employee.setBirthday(birthday);

        System.out.println("Please enter your salary");
        Double salary = scanner.nextDouble();
        employee.setSalary(salary);

        return employee;
    }
        }