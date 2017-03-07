/**
 * Created by DK on 07.03.2017.
 */
public class Hotel {

    private String name;
    private int numberOfRooms;

    private Room[] rooms;

//    Room ibis = new Room(1, false);

    public Hotel(String name, int numberOfRooms) {
        rooms = new Room[numberOfRooms];
        for (int i = 0; i < numberOfRooms; i++) {
            rooms[i] = new Room(i + 1, false);
            if (rooms[i].isOccupied() == false) {
                System.out.println("Room no. " + (i + 1) + " is available.");
            } else {
                System.out.println("Room no. " + (i + 1) + " is not available.");
            }

        }
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
