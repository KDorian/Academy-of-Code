import java.util.LinkedList;
import java.util.Random;

/**
 * Created by DK on 07.03.2017.
 */
public class Exercise_6 {
        public static void main(final String[] args) {
            LinkedList m = new LinkedList();
            Random generator = new Random();

            for(int i=0; i<1; i++) {

                m.add(generator.nextInt(100));

            }
            System.out.print(m);
            }
}
