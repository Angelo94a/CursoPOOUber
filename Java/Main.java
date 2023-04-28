/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("hola mundo");
        Car car = new Car();
        car.license = "AMC123";
        car.driver = "Angelo Almeida";
        car.passegenger = 4;
        car.printData();
    }
}