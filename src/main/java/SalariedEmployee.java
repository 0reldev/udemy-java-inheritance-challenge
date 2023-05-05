public class SalariedEmployee extends Employee {

    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String endDate) {
        super(name, birthDate, endDate);
    }

    public SalariedEmployee(String name, String birthDate, String endDate, int employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    protected void retire() {
        if (!isRetired) {
            this.isRetired = true;
            System.out.println(this.name + " is retiring.");
        } else
            System.out.println(this.name + " is already retired.");
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "isRetired=" + isRetired +
                ", employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }
}
