class UberX extends Car {
    String brand;
    String model;

    public UberX(String lisence, Account driver, String brand, String model) {
        super(lisence, driver);
        this.brand = brand;
        this.model = model;
    }

}