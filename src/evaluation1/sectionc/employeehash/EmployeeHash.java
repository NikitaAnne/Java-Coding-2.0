package evaluation1.sectionc.employeehash;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHash {
    public static void main(String[] args) {


        Map<Integer, Integer> loginCounts = new HashMap<>();
        loginCounts.put(101, 10);
        loginCounts.put(102, 23);
        loginCounts.put(103, 45);

        loginCounts.put(101, 22); //update
        int employeeId = 102;
        System.out.println("Login counts for: " + employeeId + loginCounts.get(employeeId));

        System.out.println("Employees with more than 20 logins: ");
        for (Map.Entry<Integer, Integer> entry : loginCounts.entrySet()) {
            if (entry.getValue() > 20) {
                System.out.println(entry.getKey());
            }
        }

    }
}
