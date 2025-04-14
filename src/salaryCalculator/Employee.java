package salaryCalculator;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;


    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double duty = 0;
        if (salary > 1000) {
            duty = salary * 3 / 100;
        }
        return duty;
    }

    public int bonus() {
        int extraPayment = 0;
        if (workHours > 40) {
            extraPayment = (workHours - 40) * 30;
        }
        return extraPayment;
    }

    public double raiseSalary() {
        //current year 2021
        int spentYear = 2021 - hireYear;
        double raise = 0;
        if (spentYear < 10) {
            raise = salary * 5 / 100;
        } else if (spentYear >= 10 && spentYear < 20) {
            raise = salary * 10 / 100;
        } else if (spentYear >= 20) {
            raise = salary * 15 / 100;
        }
        return raise;
    }


    @Override
    public String toString() {
        return "name = " + name + '\n' +
                "salary = " + salary + '\n' +
                "workHours = " + workHours + '\n' +
                "hireYear = " + hireYear + '\n' +
                "tax = " + tax() + '\n' +
                "bonus = " + bonus() + '\n' +
                "raise = " + raiseSalary() + '\n' +
                "Salary with Taxes and Bonuses = " + (salary + bonus() - tax()) + '\n' +
                "Total Salary = " + (salary + bonus() - tax() + raiseSalary()) + '\n';

    }
}
