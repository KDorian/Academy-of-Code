import java.util.Scanner;

/**
 * Created by DK on 06.03.2017.
 */
public class Exercise_2 {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wartości liczb a, b:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double result = ((a+b)/2);
        System.out.println(result);
        }

}
