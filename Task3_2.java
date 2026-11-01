import java.util.ArrayList;

public class Task3_2 {
    public static void main(String[] args) {
        Engine engine = new Engine(150);
        Car car = new Car("Toyota Camry", engine);
        
        Passenger p1 = new Passenger("Алексей");
        Passenger p2 = new Passenger("Мария");
        Passenger p3 = new Passenger("Дмитрий");

        car.addPassenger(p1);
        car.addPassenger(p2);
        car.addPassenger(p3);
        car.displayInfo();
        
        System.out.println("\nМария выходит из машины...");
        car.removePassenger(p2);
        
        car.displayInfo();
    }
}

class Engine {
    private int power;

    public Engine(int power) {
        this.power = power;
    }

    public int getPower() { return power; }
    public void setPower(int power) { this.power = power; }
}

class Passenger {
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

class Car {
    private String model;
    private Engine engine;
    private ArrayList<Passenger> passengers;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.passengers = new ArrayList<>();
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public void removePassenger(Passenger passenger) {
        passengers.remove(passenger);
    }

    public void displayInfo() {
        System.out.println("Автомобиль: " + model + " | Мощность двигателя: " + engine.getPower() + " л.с.");
        System.out.println("Пассажиры в салоне (" + passengers.size() + "):");
        if (passengers.isEmpty()) {
            System.out.println(" - Нет пассажиров");
        } else {
            for (Passenger p : passengers) {
                System.out.println(" - " + p.getName());
            }
        }
    }
}
