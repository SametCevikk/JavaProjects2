package salaryCalculator;


public class SalaryCalculator   {

    public static void main(String[] args) {

        Employee employee = new Employee("John",2000,45,1985);
        employee.tax();
        employee.bonus();
        employee.raiseSalary();
        System.out.println(employee);

    }
}
