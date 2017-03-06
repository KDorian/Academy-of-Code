/**
 * Created by DK on 06.03.2017.
 */
public class ShiftTime {

    public static void main(final String[] args) {
                int actualTime=12; // actual time
                int timeAdded=68; // amount of hours added
                int timeAfter=(actualTime+timeAdded)%24; // hour after adding time
                int daysPassed=(actualTime+timeAdded)/24; // how many days passed after adding time
                System.out.println("Czas po dodaniu: " +timeAfter);
                System.out.println("Ilosc dni, ktore minely: " + daysPassed);
    }
}
