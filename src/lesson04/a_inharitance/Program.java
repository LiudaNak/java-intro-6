package lesson04.a_inharitance;

public class Program {
    public static void main(String[] args) {
        Truck truck = new Truck("Renault", 2005);
        PassengerCar car = new PassengerCar("Daewoo", 2010);

        System.out.println(truck);
        System.out.println(car);

        truck.gas();
        car.gas();
        truck.gas();
        car.stop();

    }
}
