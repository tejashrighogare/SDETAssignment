import java.util.Scanner;
public class taxSalary {
    public static double taxSalaryCount(double salary)
 {
 double incomeTaxAmt = 0;
 double TaxPerc = 0;
 if (salary <= 500000)
 TaxPerc = 0;
 else if (salary > 500000 && salary <= 700000)
 TaxPerc = 10;
 else if (salary > 700000 && salary <= 1000000)
 TaxPerc = 15;
 else if (salary > 1000000 && salary <= 1500000)
 TaxPerc = 20;
 else if (salary > 1500000)
 TaxPerc = 30;
 incomeTaxAmt = salary*TaxPerc/100;
 return incomeTaxAmt;
 }

    public static void main(String[] args) {

        Scanner sal = new Scanner(System.in);
        System.out.print("Enter Employee salary");
        double empSalaryAmt = sal.nextDouble();
       double incomeTaxAmt= taxSalaryCount(empSalaryAmt);
       System.out.println("Employee income Tax amount = Rs. "+incomeTaxAmt);

    }
}
