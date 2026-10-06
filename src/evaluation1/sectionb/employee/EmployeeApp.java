package evaluation1.sectionb.employee;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Nikita", 80000);
        System.out.println("Id: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
    }
}
