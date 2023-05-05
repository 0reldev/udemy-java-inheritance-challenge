public class Employee extends Worker {

    int employeeId;
    String hireDate;

    public Employee(String name, String birthDate, String endDate) {
        super(name, birthDate, endDate);
    }

    public Employee(String name, String birthDate, String endDate, int employeeId, String hireDate) {
        super(name, birthDate, endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }
}
