/**
 * Created by DK on 07.03.2017.
 */
public class Run {
    public static void main(final String[] args) {

        Hotel ibis = new Hotel("Ibis", 10);
        Hotel gubus = new Hotel("Gubus", 5);

        ibis.print();
        gubus.print();

        ibis.reserved(2);
        ibis.reserved(5);

        gubus.reserved(1);

        ibis.printAvailableRooms();
        gubus.printAvailableRooms();
    }
}
