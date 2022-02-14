package com.knoldus;
import com.knoldus.learning.design.salary.entity.Contact;
import com.knoldus.learning.design.salary.entity.Employee;
import com.knoldus.learning.design.salary.entity.Salary;
import com.knoldus.learning.design.salary.type.CurrencyType;
import com.knoldus.learning.design.salary.type.DepartmentType;
import com.knoldus.learning.design.salary.type.EmployeeType;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static com.knoldus.learning.design.salary.util.CurrencyConverter.getSalaryInBaseCurrency;

/**
 * main method implemented
 */
public class MainMethodImpl {

    public static void main(String[] args) {
        

    List<Employee> employeeList = new ArrayList<>();
    List<Employee> employeeListWithSalaryMoreThanTheRange;
    employeeList.add(new Employee(1, "KRISHNA JAISWAL", new Contact("9621729578", "Jaiswalk526@gmail.com"),
            DepartmentType.IT, new Salary(CurrencyType.INR,
            8000), EmployeeType.FullTime));
    employeeList.add(new Employee(2, "PRATIBHA YADAV", new Contact("9808976786", "pratibha@gmail.com"),
            DepartmentType.HR, new Salary(CurrencyType.USD,
            6000), EmployeeType.PartTime));
    employeeList.add(new Employee(3, "SHASHIKANT TANTI", new Contact("79786548799", "shashikant@gmail.com"),
            DepartmentType.IT, new Salary(CurrencyType.USD,
            5000), EmployeeType.FullTime));
    employeeList.add(new Employee(4, "SHAKTI JAISWAL", new Contact("9621729578", "shakti@gmail.com"),
            DepartmentType.IT, new Salary(CurrencyType.INR,
            7800), EmployeeType.FullTime));
    employeeList.add(new Employee(4, "AMIT YADAV", new Contact("9878656786", "amityadav@gmail.com"),
            DepartmentType.IT, new Salary(CurrencyType.INR,
            7800), EmployeeType.FullTime));
    employeeList.add(new Employee(4, "SHAKTI JAISWAL", new Contact("6387826567", "shaktijaiswal@gmail.com"),
            DepartmentType.IT, new Salary(CurrencyType.INR,
            7800), EmployeeType.FullTime));

    employeeListWithSalaryMoreThanTheRange = employeeList.stream().
            peek(System.out::println).
            filter(t -> getSalaryInBaseCurrency(t) >= 5000.0).
            peek(System.out::println).
            collect(Collectors.toList());
//        double salaryInBaseCurrency = getSalaryInBaseCurrency(list.get(0));
System.out.println("Employee whose salary is greater than 5000 are");
    System.out.println("Employee whose salary is greater than 5000 are");
    System.out.println("Employee whose salary is greater than 5000 are");
    for(Employee employee : employeeListWithSalaryMoreThanTheRange) {
        System.out.println("Name is = " + employee.getName() + " Salary is = " + getSalaryInBaseCurrency(employee));
    }
}

}