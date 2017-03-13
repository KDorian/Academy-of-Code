import java.util.Scanner;

/**
 * Created by DK on 13.03.2017.
 */
public class Exercise_7a {
    public static void main(String[] args)
    {
        System.out.println("Give the height of tower");
        Scanner sc = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
        int height = sc.nextInt();
        int i;

        for (i = 1; i <= height; i++)
        {

            System.out.print("*");

            for (int k = 1; k < i; k++)
            {
                System.out.print("*");
            }

            System.out.println();



        }
    }
}
