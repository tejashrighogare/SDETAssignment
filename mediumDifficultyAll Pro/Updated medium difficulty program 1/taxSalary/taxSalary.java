package taxSalary;

class taxSalary {
    /*
    Q.1 Write a java program to find tax for employee. The program should
    calculate the income tax to be paid by the employee as per the criteria given below:
    Slab rate IT rate
    Upto Rs. 7,00,000 Nil
    Above Rs. 7,00,000 (0-5,00,000=nil,5,00,000 – 7,00,000=10%)
    Rs. 7,00,000-10,00,000 15% on additional amount
    Rs. 10,00,000-15,00,000 20% on additional amount

    Above 15,00,000 30% on additional amount
    Result: - income tax is …………………………….
    */
    public static void main(String[] args) {
        taxSalaryCount(1000000);
    }

    public static void taxSalaryCount(int salary) {
        double tax = 0;
        int caseValue = 0;
        caseValue = (salary <= 700000) ? 1 : (salary > 700000 && salary <= 1000000) ? 2 : (salary > 1000000 && salary <= 1500000) ? 3 : 4;
        switch (caseValue) {
            case 1: {
                tax = 0;
                break;
            }
            case 2: {
                tax = (0.15 * (salary - 700000)) + (0.1 * 200000);
                break;
            }
            case 3: {
                tax = (0.2 * (salary - 1000000)) + (0.15 * 300000) + (0.1 * 200000);
                break;
            }
            default: {
                tax = (0.3 * (salary - 1500000)) + (0.2 * 500000) + (0.15 * 300000) + (0.1 * 200000);
                break;
            }
        }
        System.out.println("Income tax is = " + Math.round(tax));
    }
}


