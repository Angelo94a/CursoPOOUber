public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passegenger;

    public Car(String lisence, Account driver) {
        this.license = license;
        this.driver = driver;
    }
    void printData() {
        System.out.println("License" + license + "Name Driver: " + driver.name);
    }
}
