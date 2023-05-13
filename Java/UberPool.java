public class UberPool extends Car{
    String brand;
    String model;
    
    public UberPool(String lisence, Account driver, String brand, String mode) {
        super(lisence, driver);
        this.brand = brand;
        this.model = mode;
    }
}
