package homeworks.hw1.scooter;

public class ScooterRentalTester {
    public static void main(String[] args) {
        Scooter scooter = new Scooter();
        RentalCompany rental = new RentalCompany();

        /*
        scooters 01 and 02, with model names, ids, battery levels
        x and y coordinates, and availability
         */
        Scooter scooter01 = new Scooter();
        scooter01.setModel("Scooter 01");
        scooter01.setId(1);
        scooter01.setBatteryLevel(100);
        scooter01.setX(0);
        scooter01.setY(0);
        scooter01.setAvailable(true);

        Scooter scooter02 = new Scooter();
        scooter02.setModel("Scooter 02");
        scooter02.setId(2);
        scooter02.setBatteryLevel(100);
        scooter02.setX(0);
        scooter02.setY(0);
        scooter02.setAvailable(true);

        //add scooters to the rental company
        rental.addScooter(scooter01);
        rental.addScooter(scooter02);

        //renting scooter via id
        rental.rentScooter(scooter01.getId());

        //travel to the university
        timeAndTravel(scooter01, 41.7121106, 44.7489232);

        //return scooter
        rental.returnScooter(scooter.getId(), 41.7121106, 44.7489232);

        //simulate time progression
        try {
            Thread.sleep(2000); //wait for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //renting scooter after an hour
        rental.rentScooter(scooter01.getId());

        //travel to home
        timeAndTravel(scooter01, 43.84864, 18.35644);

        //return scooter
        rental.returnScooter(scooter.getId(), 43.84864, 18.35644);
    }


    /*
    gets model of the scooter and the coordinates.
    simulates time travel, until it reaches the desired destination
     */
    public static void timeAndTravel(Scooter scooter, double x, double y) {
        //simulating travel time
        try {
            Thread.sleep(2000); //simulate travel time with a 2-second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //setting the corresponding coordinates
        scooter.setX(x);
        scooter.setY(y);

        System.out.println("Arrived at destination.");
    }
}
