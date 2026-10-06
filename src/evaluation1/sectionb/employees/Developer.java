package evaluation1.sectionb.employees;

public class Developer extends Employees {
    @Override
    public double calculateBonus(double salary) {

        return salary * .10;
    }
}
