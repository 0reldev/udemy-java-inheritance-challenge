public class Main {

    public static void main(String[] args) {

        HourlyEmployee john = new HourlyEmployee("John", "2000.02.13", "2056.02.03", 23, "2023.05.05", 20d);
        SalariedEmployee patrick = new SalariedEmployee("Patrick", "2000.02.13", "2056.02.03", 23, "2023.04.05", 200d, false);

        System.out.println(john);
        System.out.println(patrick);

        john.getDoublePay();
        patrick.retire();


    }
}
