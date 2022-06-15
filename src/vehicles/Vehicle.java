package vehicles;
//Mini-exercise
//        Create a Vehicle class with two properties: a name instance variable and a makeNoise() method. The instance variable should be private and have getters and setters (in IntelliJ try cmd-N). The makeNoise method should just sout out a typical vehicle noise. Then create a more specific vehicle subclass, such as Motorcycle, Car, Truck, Tractor, whatever. Make the specific vehicle class extend the Vehicle class. Otherwise, keep it empty. Create a test class, perhaps calling it VehicleTest Instantiate the specific vehicle, assign a value to the name property and run the methods on the specific vehicle. Notice the inherited method works and the inherited name property is assignable on the subclass.
//Mini-exercise
//        Create another subclass of Vehicle. Inside this subclass, create a makeNoise method that overrides the superclass makeNoise method. Instantiate the new vehicle type in your VehicleTest class and run the makeNoise method on it to verify that it does make a different noise.

public class Vehicle {
//    public static void main(String[] args) {
        private String name;
        public String getName() {
            return name;
        }

//        public vehicles.Vehicle (String name){
           public void setName(String name){
            this.name = name;
        }
        public void makeNoise(){
            System.out.println("Honk, Honk");
        }
    }

