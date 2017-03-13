import java.util.Random;

/**
 * Created by DK on 13.03.2017.
 */
public class Exercise_3 {
    public static void main(String[] args) {
        int number;
        Random draw = new Random();
        for (int i = 0; i < 10; i++) {
            number = draw.nextInt();

            System.out.println(number);

        }

    }
}
