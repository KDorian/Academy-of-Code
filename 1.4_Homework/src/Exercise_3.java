import java.util.Scanner;

/**
 * Created by DK on 07.03.2017.
 */
public class Exercise_3 {
        public static void main(final String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj ilość siedzeń i rzędów:");
            int allSeats = sc.nextInt();
            int rows = sc.nextInt();
            int seatsInRow = allSeats/rows;
            System.out.println("Ilość wszystkich miejsc: " + allSeats + "\nIlość miejsc w 1 rzędzie: " + seatsInRow);
            }
}
