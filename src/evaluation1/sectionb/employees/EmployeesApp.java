package evaluation1.sectionb.employees;

public class EmployeesApp {
    public static void main(String[] args) {
        Employees developer = new Developer();
        Employees manager = new Manager();
        System.out.println("Developer's salary: " + developer.calculateBonus(4000));
        System.out.println("Manager's salary: " + manager.calculateBonus(7000));

    }
}
