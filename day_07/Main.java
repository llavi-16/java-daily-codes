abstract class Vehicle {  // abstract class
    abstract void start();  // abstract method
    abstract void stop();  // abstract method
}

class Motorbike extends Vehicle {
    @Override
    void start() {
        System.out.println("Motorbike started");
    }

    @Override
    void stop() {
        System.out.println("Motorbike stopped");
    }
}

class Truck extends Vehicle {
    @Override
    void start() {
        System.out.println("Truck started");
    }

    @Override
    void stop() {
        System.out.println("Truck stopped");
    }
}

@SuppressWarnings("unused")
class Main {
    public static void main(String[] args) {
        Vehicle vehicle;  // reference variable of abstract class

        vehicle = new Motorbike(); // assigning a concrete class object
        vehicle.start();
        vehicle.stop();


        vehicle = new Truck();  // assigning a concrete class object
        vehicle.start();
        vehicle.stop();
    }
}