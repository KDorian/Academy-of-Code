/**
 * Created by DK on 15.03.2017.
 */
public class Main {
        public static void main(final String[] args) {
            Integer num = null;
            try {
                num = Integer.parseInt(args[0]);
                System.out.println("program zostalby wywolany z parametrem " + num);

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }


            }
}
