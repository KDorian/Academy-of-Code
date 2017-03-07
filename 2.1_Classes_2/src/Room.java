/**
 * Created by DK on 07.03.2017.
 */
public class Room {
    private int number;
    public boolean occupied;

    public Room(int number, boolean occupied) {
        this.number = number;
        this.occupied = occupied;
    }

    public int getNumber() {
        return number;
    }

    public boolean isOccupied() {
        return occupied;
    }
}
