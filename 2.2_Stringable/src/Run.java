/**
 * Created by DK on 07.03.2017.
 */
public class Run {
        public static void main(final String[] args) {

            String name = "Dorian";
            String kuba = "Kuba";
            String dima = "Dima";

            if((name.equals(kuba))||(name.equals(dima))){
                System.out.println("Jest to imie meskie.");
            } else if(name.endsWith("a")){
                System.out.println("Jest to imie zenskie.");
            } else {
                System.out.println("Jest to imie meskie.");
            }


            }
}
