package homeworks.hw1.scooter;

import java.util.ArrayList;
import java.util.List;

public class RentalCompany {

    private int uid = 0;

    List<Scooter> scooters = new ArrayList<>();

    //returns the list of available scooters
    public List<Scooter> availableScooters() {
        List<Scooter> result = new ArrayList<>();
        for (Scooter scooter : scooters) {
            if (scooter.isAvailable()) {
                result.add(scooter);
            }
        }
        return result;
    }

    //adds new scooters
    public void addScooter(Scooter scooter) {
        scooter.setId(uid++);
        scooters.add(scooter);
    }

    /*
    loops through the list of scooters, checks via id
    and removes the corresponding scooter
     */
    public boolean removeScooter(int id) {
        boolean removed = false;
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id) {
                scooters.remove(scooter);
                removed = true;
                break;
            }
        }
        return removed;
    }

    /*
    loops through the list of scooters, checks via the id
    and if the scooter is available, then rents it.
     */
    public void rentScooter(int id) {
        for (Scooter scooter : scooters) {
            if (scooter.id == scooter.getId() && scooter.isAvailable()) {
                scooter.setAvailable(false);
                break;
            }
        }
    }

    //returns the scooter
    //checks for the id and sets the x and y coordinates correspondingly
    public void returnScooter(int id, double x, double y) {
        for (Scooter scooter : scooters) {
            if (id == scooter.getId()) {
                scooter.setAvailable(true);
                scooter.setX(x);
                scooter.setY(y);
                break;
            }
        }
    }

    //displays all scooters, by looping through the list
    public void displayAllScooters() {
        for (Scooter scooter : scooters) {
            System.out.println(scooter);
        }
    }
}