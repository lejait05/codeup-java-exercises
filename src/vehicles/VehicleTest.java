package vehicles;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Chevelle");
        System.out.print(car.getName() + " goes ");
        car.makeNoise();

        Helicopter helicopter = new Helicopter ();
        helicopter.setName("Helicopter");
        System.out.print(helicopter.getName() + " goes ");
        helicopter.makeNoise();
    }
}
