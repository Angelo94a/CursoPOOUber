/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("hola mundo");
        Car car = new Car("AMC123", new Account("Angelo Almeida", "AMC123"));
        car.passegenger = 4;
        car.printData();
    }
}