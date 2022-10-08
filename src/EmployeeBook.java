import java.util.HashMap;
import java.util.Map;


public class EmployeeBook {
    private final Map<String, Employee> employees = new HashMap<>();

    private String getKey(Employee employee) {
        return employee.getName() + " " + employee.getSurname() + " " + employee.getPatronymicName();
    }

    public void addEmployee(Employee employee) {
        employees.put(getKey(employee), employee);
    }

    public void addEmployee(String name,
                            String surname,
                            String patronymicName,
                            double salary,
                            int department) {
        addEmployee(new Employee(name, surname, patronymicName, salary, department));
    }

    private void removeEmployee(Employee employee) {
        employees.remove(getKey(employee));
    }

    public void removeEmployee(int id) {
        String employeeKyeForRemoving = null;
        for (String key : employees.keySet()) {
            if (employees.get(key).getId() == id) {
                employeeKyeForRemoving = key;
                break;
            }
        }
        if (employeeKyeForRemoving != null) {
            employees.remove(employeeKyeForRemoving);
        }
    }

    public void changeSalary(Employee employee,
                             double newSalary) {
        String key = getKey(employee);
        if (employees.containsKey(key)) {
            employees.get(key).setSalary(newSalary);
        }
    }

    public void changeDepartment(Employee employee,
                                 int Departmetn) {
        String key = getKey(employee);
        if (employees.containsKey(key)) {
            employees.get(key).setDepartment(Departmetn);
        }
    }

    public void printEmployeesByDepartment() {
        for (int department = 1; department <= 5; department++) {
            System.out.println("Сотрудники из отдела" + department + ":");
            for (Employee employee : employees.values()) {
                if (employee.getDepartment() == department) {
                    System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymicName());
                }
            }
        }
    }

    public void printEmployeesWithSalaryLessThan(double bound) {
        System.out.println("Сотрудники с ЗП меньше, чем " + bound + ":");
        for (Employee employee : employees.values()) {
            if (employee.getSalary() < bound) {
                System.out.printf(
                        "id: %d, ФИО: %s %s %s, ЗП: %.2f%n",
                        employee.getId(),
                        employee.getSurname(),
                        employee.getName(),
                        employee.getPatronymicName(),
                        employee.getSalary()
                );
            }
        }
    }

    public void printEmployeesWithSalaryGreaterOrEqualThan(double bound) {
        System.out.println("Сотрудники с ЗП меньше, чем " + bound + ":");
        for (Employee employee : employees.values()) {
            if (employee.getSalary() < bound) {
                System.out.printf(
                        "id: %d, ФИО: %s %s %s, ЗП: %.2f%n",
                        employee.getId(),
                        employee.getSurname(),
                        employee.getName(),
                        employee.getPatronymicName(),
                        employee.getSalary()
                );
            }
        }
    }


    public void indexSalaries(double index) {
        for (Employee employee : employees.values()) {
                employee.setSalary(employee.getSalary()+ employee.getSalary()* index/100);
        }
    }
    public void indexSalariesForDepatment(double index, int department) {
        for (Employee employee : employees.values()) {
            if (employee.getDepartment()== department) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * index /100);
            }
        }
    }
    public double averageSalary(){
        int count = employees.values().size();
        if (count != 0) {
            return totalSalaryes()/count;
        }
        return 0;
    }
    public double averageSalaryForDepartment(int department){
        double totalSalaryForDepartment = 0;
        int count = 0;
        for(Employee employee: employees.values()){
            if (employee.getDepartment() == department) {
                totalSalaryForDepartment+= employee.getSalary();
                count++;
            }
        }
        return count == 0 ? 0: totalSalaryForDepartment/count;
    }

    public Employee fintEmployeeWithMinSalaryFromDepartment(int department) {
        double minSalary = Double.MAX_VALUE;
        String key = null;
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            Employee employee = entry.getValue();
            if (employee.getDepartment() == department && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                key = entry.getKey();
            }
        }
        if (key!= null){
            return employees.get(key);
        }else {
            return null;
        }
    }

    public Employee fintEmployeeWithMinSalary() {
        double minSalary = Double.MAX_VALUE;
        String key = null;
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            Employee employee = entry.getValue();
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                key = entry.getKey();
            }
        }
        if (key!= null){
            return employees.get(key);
        }else {
            return null;
        }
    }

    public Employee fintEmployeeWithMaxSalaryFromDepartment(int department) {
        double maxSalary = Double.MIN_VALUE;
        String key = null;
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            Employee employee = entry.getValue();
            if (employee.getDepartment() == department && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                key = entry.getKey();
            }
        }
        if (key!= null){
            return employees.get(key);
        }else {
            return null;
        }
    }
    public Employee fintEmployeeWithMaxSalary() {
        double minSalary = Double.MIN_VALUE;
        String key = null;
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            Employee employee = entry.getValue();
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                key = entry.getKey();
            }
        }
        if (key!= null){
            return employees.get(key);
        }else {
            return null;
        }
    }
    public double totalSalaryesForDepartment(int department){
        double sum = 0;
        for (Employee employee: employees.values()){
            if (employee.getDepartment()== department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public double totalSalaryes(){
        double sum = 0;
        for (Employee employee: employees.values()){
                sum += employee.getSalary();
        }
        return sum;
    }

    public void printFullNameEmployees(){
        for (Employee employee: employees.values()){
            System.out.println(employee.getName() + " " + employee.getSurname() + " " + employee.getPatronymicName());
        }
    }
    public void printAllNameEmployees(){
        for (Employee employee: employees.values()){
            System.out.println(employee);
        }
    }
    public void printAllEmployeesFromDepartment(int department) {
        for (Employee employee : employees.values()) {
            if (employee.getSalary() == department) {
                System.out.printf(
                        "id: %d, ФИО: %s %s %s, ЗП: %.2f%n",
                        employee.getId(),
                        employee.getSurname(),
                        employee.getName(),
                        employee.getPatronymicName(),
                        employee.getSalary()
                );
            }
        }
    }











































}


