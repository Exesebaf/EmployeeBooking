public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        Employee Yulia = new Employee ("Yulia ", "Bogdanovna", "Vinokurova",45000,1);
        employeeBook.addEmployee("Madonna", "TitovaMakarovna", "Titova",35000,2);

        employeeBook.addEmployee(Yulia);

        employeeBook.changeSalary(Yulia,43000);

        employeeBook.printEmployeesByDepartment();

        employeeBook.printAllNameEmployees();

        employeeBook.printAllNameEmployees();
        double totalSalaries = employeeBook.totalSalaryes();
        System.out.printf("Сумма ЗП всех сотрудников за месяц %.3f%n", totalSalaries);

        Employee employeeWithMinSalary = employeeBook.fintEmployeeWithMinSalary();
        System.out.println("Сотрудик с минимальной ЗП: "+ employeeWithMinSalary);

        Employee employeeWithMaxSalary = employeeBook.fintEmployeeWithMaxSalary();
        System.out.println("Сотрудик с минимальной ЗП: "+ employeeWithMaxSalary);

        double averageSalary = employeeBook.averageSalary();
        System.out.println("Средняя ЗП всех сотрудников за месяц: "+ averageSalary);
        employeeBook.printFullNameEmployees();

        employeeBook.indexSalaries(10);
        System.out.println("После индексации");
        employeeBook.printAllNameEmployees();

        System.out.printf("Сотрудник с минимальной ЗП из %d отдела: %s%n",1,employeeBook.fintEmployeeWithMinSalaryFromDepartment(1));
        System.out.printf("Сотрудник с максимальной ЗП из %d отдела: %s%n",2,employeeBook.fintEmployeeWithMaxSalaryFromDepartment(2));
        System.out.printf("Сумма ЗП всех сотрудникв за месяц из отдела %d: %.2f%n",3,employeeBook.totalSalaryesForDepartment(3));
        System.out.printf("Сотрудник с минимальной ЗП из %d отдела: %s%n",4,employeeBook.averageSalaryForDepartment(4));

        employeeBook.indexSalariesForDepatment(5,1);
        System.out.println("После индексации для отдела" +1);
        employeeBook.printAllEmployeesFromDepartment(1);
        employeeBook.printEmployeesWithSalaryLessThan(55000);
        employeeBook.printEmployeesWithSalaryGreaterOrEqualThan(55000);























    }
}