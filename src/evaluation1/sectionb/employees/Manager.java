package evaluation1.sectionb.employees;

public class Manager extends Employees {
    @Override
    public double calculateBonus(double salary) {

        return salary * .20;
    }
}
