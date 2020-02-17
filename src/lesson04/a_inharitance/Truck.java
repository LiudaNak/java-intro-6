package lesson04.a_inharitance;

public class Truck extends Vehicle {
    public Truck(String model, int produceYear) {
        super(model, produceYear);
    }

    @Override
    public String toString(){
        return "Truck{} extends " + super.toString();
    }
}
