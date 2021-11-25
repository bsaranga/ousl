public class CabRide {

    public static void main(String[] args) {

        CabRide myCabRide = new CabRide("Nissan Leaf", "Marty");
        myCabRide.setPickUpLocation("Colombo");
        myCabRide.setDropLocation("Anuradhapura");
        myCabRide.setNumberOfPassengers(5);
        myCabRide.setRunKm(450);

        myCabRide.setCabFare(myCabRide.calculateCabFare(myCabRide.getRunKm()));
        myCabRide.displayRideDetails();
    }

    private String carName;
    private String driverName;
    private String pickLocation;
    private String dropLocation;
    private int numPassengers;
    private double runKm;
    private double cabFare;

    private static final double pricePerKm = 25.50;

    public CabRide(String carName, String driverName) {
        this.carName = carName;
        this.driverName = driverName;
    }
    // Getters
    
    public String getCarName() {
        return this.carName;
    }

    public String getDriverName() {
        return this.driverName;
    }

    public String getPickUpLocation() {
        return this.pickLocation;
    }

    public String getDropLocation() {
        return this.dropLocation;
    }

    public int getNumOfPassengers() {
        return this.numPassengers;
    }

    public double getRunKm() {
        return this.runKm;
    }

    public double getCabFare() {
        return this.cabFare;
    }
    
    //Setters

    public void setPickUpLocation(String pickUpLocation) {
        this.pickLocation = pickUpLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public void setNumberOfPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public void setRunKm(double runKm) {
        this.runKm = runKm;
    }

    public void setCabFare(double cabFare) {
        this.cabFare = cabFare;
    }

    // Logic

    public void displayRideDetails() {
        
        StringBuilder details = new StringBuilder();
        details
            .append("-- Ride Details --")
            .append("\n\n")
            .append(String.format("Car Name: %s\n", getCarName()))
            .append(String.format("Driver Name: %s\n", getDriverName()))
            .append(String.format("Pickup Location: %s\n", getPickUpLocation()))
            .append(String.format("Drop Location: %s\n", getDropLocation()))
            .append(String.format("No of Passengers: %s\n", getNumOfPassengers()))
            .append(String.format("Kilometers of the ride: %s\n", getRunKm()))
            .append(String.format("Total fare of the ride: %s\n\n", getCabFare()))
            .append("-- Thank You --");

        System.out.println(details);
    }

    public double calculateCabFare(double runKm) {
        return this.runKm * pricePerKm;
    }
}