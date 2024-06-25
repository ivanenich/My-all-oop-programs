package mainTests;public class Main {
    public static void main (String[] args){
        // new object(Car)
        Car car = new Car("Cabriolet","Ferrari F90", "Red or Yellow",340.7);
        //import the fields
        car.setType("Cabriolet");
        car.setMarkCar("Ferrari F90");
        car.setColor("Red or Yellow");
        car.setMaxSpeed(340.7);
        //methods
        car.speed();
        car.name();
        car.famousColor();
    }
}
