public class Program {
    public static void main(String[] args) {

        CabRide myCabRide = new CabRide("Nissan Leaf", "Marty");
        myCabRide.setPickUpLocation("Colombo");
        myCabRide.setDropLocation("Anuradhapura");
        myCabRide.setNumberOfPassengers(5);
        myCabRide.setRunKm(450);

        myCabRide.setCabFare(myCabRide.calculateCabFare(myCabRide.getRunKm()));
        myCabRide.displayRideDetails();
    }
}
