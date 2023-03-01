package day07_relational_operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        double salary = 100_000,
                stateTaxRate = 0.08,
                federalTaxRate = 0.21,
                stateTax, federalTax, totalTax, salaryAfterTax;

        stateTax = salary * 0.08; // %8
        federalTax = salary * 0.21; //%21
        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;

        System.out.println("State tax rate: " + stateTaxRate + "\nFederal tax rate: " + federalTaxRate + "\nBase salary: " + salary + "\nTotal Tax amount: $" + totalTax + "\nThe ssalary after tax $" + salaryAfterTax);


    }

}

/*
 add a main method
    declare and assign these variables:

       salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax

    Sample date:
       100000 (salary)
       0.08 (state tax rate)
       0.21 (federal tax rate)

    Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

    Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes
 */