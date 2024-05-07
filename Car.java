/** 
 * Lab 10 Car class
 * @author Braeden Kinloch
 * <br>
 * Date: 05/07/2024
*/

public class Car extends Vehicle{
    // instance variables
    int doors;
    int passengers;

    // constructor
    public Car (String aMake, String aModel, String aPlate, int doors, int passengers) {
        super(aMake, aModel, aPlate);
        this.doors = doors;
        this.passengers = passengers;
    }

    public int getDoors(){
        return this.doors;
    }

    public int getPassengers(){
        return this.passengers;
    }

    @Override
    public String toString(){
        String str = String.format("#%d-door %s %s with license %s", this.doors, super.getMake(), super.getModel(), super.getPlate());
        return str;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Car)) {
            return false;
        }
        Car other = (Car) obj;

        return this.doors == other.doors && this.passengers == other.passengers && super.equals(other);
    }


    public Car copy() {
        // Copying current instance variable data
		int copyDoors = this.getDoors() ;
		int copyPassengers = this.getPassengers() ;
				
		// Creating a new copy of the current instance variable 
		Car copyCar = new Car(super.getMake(), super.getModel(), super.getPlate(), copyDoors, copyPassengers);
		return copyCar ;
	}



}