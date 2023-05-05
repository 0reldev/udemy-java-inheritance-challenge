import java.time.Instant;

public class Worker {

    String name;
    String birthDate;
    String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    private int getAge() {
        return 36;
    }

    private double collectPay() {
        return 20d;
    }

    private void terminate(String endDate) {
        this.endDate = Instant.now().toString();
    }
}
