package evaluation1.sectionc.employeelist;

import java.util.ArrayList;

public class EmployeeListApp {
    public static void main(String[] args) {
        ArrayList<EmployeeList> employeeLists = new ArrayList<>();
        employeeLists.add(new EmployeeList(101, "Nikita", "IT", 80000));
        employeeLists.add(new EmployeeList(102, "Diya", "IT", 55000));
        employeeLists.add(new EmployeeList(103, "Karthik", "Sales", 60000));
        employeeLists.add(new EmployeeList(101, "Aiswarya", "HR", 62000));
        System.out.println("All employees from IT department: ");
        for (EmployeeList employee : employeeLists) {

            if (employee.getDepartment().equals("IT")) {
                System.out.println(employee);
            }
        }

        EmployeeList highestSalaryEmployee = employeeLists.get(0);

        for (EmployeeList employee : employeeLists) {

            if (employee.getSalary() > highestSalaryEmployee.getSalary()) {
                highestSalaryEmployee = employee;
            }
        }

        System.out.println("Employee with highest salary is: " + highestSalaryEmployee);

    }

}
