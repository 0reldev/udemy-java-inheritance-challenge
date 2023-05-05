public class HourlyEmployee extends Employee {

    double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String endDate, int employeeId, String hireDate, double hourlyPayRate) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    void getDoublePay() {
        System.out.println(this.name + " is getting double pay.");
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                ", employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }
}
