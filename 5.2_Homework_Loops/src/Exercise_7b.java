import java.util.Scanner;

/**
 * Created by DK on 13.03.2017.
 */
public class Exercise_7b {
    public static void main(String[] args)
    {
        System.out.println("Give the height of christmas tree");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        height = height*2;
        int i;

        for (i = 1; i <= height; i+=2)
        {
            for (int m = (height - i) / 2; m > 0; m--)
            {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int k = 1; k < i; k++)
            {
                System.out.print("*");
            }

            System.out.println();



        }
    }
}
