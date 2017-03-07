/**
 * Created by DK on 07.03.2017.
 */
public class Hotel {

    private String name;
    private int numberOfRooms;

    public Hotel(String name, int numberOfRooms) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void print() {
        System.out.println(name);
        System.out.println(" Number of rooms: " + numberOfRooms);

    }
}
