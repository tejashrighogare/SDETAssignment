import java.util.Scanner;

public class taxSalary {
    public static void taxSalaryCount(double salary) {
        double tax = 0;
        if (salary <= 500000)
            tax = 0;
        else if (salary > 500000 && salary <= 700000)
            tax = 0.1 * (salary - 500000);
        else if (salary > 700000 && salary <= 1000000)
            tax = (0.15 * (salary - 700000)) + (0.1 * 200000);
        else if (salary > 1000000 && salary <= 1500000)
            tax = (0.2 * (salary - 1000000)) + (0.15 * 300000) + (0.1 * 200000);
        else
            tax = (0.3 * (salary - 1500000)) + (0.2 * 500000) + (0.15 * 300000) + (0.1 * 200000);
        System.out.println("Income tax amount is " + tax);
    }

    public static void main(String[] args) {
        taxSalaryCount(2000000);
    }
}
