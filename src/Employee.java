public class Employee {
    private static int counter;
    private String name;

    private String surname;

    private String patronymicName;
    private double salary;
    private int department;
    private final int id;

    public Employee(String name, String surname, String patronymicName, double salary, int department) {
        this.id=counter++;
        this.name = name;
        this.surname = surname;
        this.patronymicName = patronymicName;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Employee.counter = counter;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "ФИО: " + name   + surname + patronymicName + ", депертамент " + department + ", зарплата " + salary + ", id " + id;
    }
//}
}
