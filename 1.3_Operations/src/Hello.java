import javax.swing.*;
import java.util.Scanner;

/**
 * Created by DK on 06.03.2017.
 */
public class Hello {

    public static void main(final String[] args) {

//        String ala ="Ala";
//        int toPrint = 3;
//
//        System.out.println(toPrint);
//        JOptionPane.showMessageDialog(null, toPrint); // window swing
//
//        System.out.println(4+2+ala);
//        System.out.println(ala+4+2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wartości liczb a, b, c:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

//        double a = 3, b = 4, c = 6;
        double result = ((a+b+c)/3);
        System.out.println(result);

    }


}
