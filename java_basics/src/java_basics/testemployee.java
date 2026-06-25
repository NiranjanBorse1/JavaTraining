package java_basics;

import com.mmcoe.emp.Clerk;
import com.mmcoe.emp.Employee;
import com.mmcoe.emp.Manager;

public class testemployee {

    public static void main(String[] args) {

        Manager m = new Manager(1500, 800);
        Clerk c = new Clerk(1200, 400);

        showsalary(m);
        showsalary(c);
    }

    private static void showsalary(Employee e) {

        if (e instanceof Manager) {
            System.out.println("Manager Salary = " + e.getsalary());
        }
        else if (e instanceof Clerk) {
            System.out.println("Clerk Salary = " + e.getsalary());
        }
    }
}