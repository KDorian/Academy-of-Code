import java.util.Scanner;

/**
 * Created by DK on 07.03.2017.
 */
public class Exercise_5 {
        public static void main(final String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj wartość liczby a: ");
            int a = sc.nextInt();
            if(a%3==0) {
                System.out.println("Ta liczba jest podzielna przez 3.");
            } else {
                System.out.println("Ta liczba nie jest podzielna przez 3.");
            }
            }
}
