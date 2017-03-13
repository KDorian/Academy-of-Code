import java.util.Scanner;

/**
 * Created by DK on 13.03.2017.
 */
public class Exercise_6 {
    public static void main(String[] args)
    {
        int i=0;
        int number;
        do
        {
            System.out.println("Give number.");
            Scanner reading = new Scanner(System.in); //obiekt do odebrania danych od użytkownika

            number = reading.nextInt();
            i=i+number;
            System.out.println("Sum:"+i);
        } while (i < 31);

        System.out.println("OK.");

    }
}
