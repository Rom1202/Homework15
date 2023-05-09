public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1");
        Car car2 = new Car("car2");

        Truck truck = new Truck("truck1");
        Truck truck2 = new Truck("truck2", 8);

        Bike bike = new Bike("bike1");
        Bike bike2 = new Bike("bike2");

        Transport[] transports = {
                car,
                car2,
                truck,
                truck2,
                bike,
                bike2
        };
        for (Transport t : transports) {
            t.service();
            System.out.println("-------------");
        }
    }
}
            




