from car import Car

if __name__ == "__main__":
    print("hola mundo")
    car = Car()
    car.license = "AMS145"
    car.driver = "Angelo Almeida"
    print(vars(car))

    car2 = Car()
    car.license = "DTA1243"
    car.driver = "vera almeida"
    car.passegenger = 3
    print(vars(car))