/**
 * Created by DK on 08.03.2017.
 */
public class Exercise_4 {
        public static void main(final String[] args) {
            String s = "0aSaaW";
            char[] tab = s.toCharArray();
            boolean checker = true;
            for (int i = 0; i < tab.length; i++) {
                if (tab[0] >= 48 && tab[0] <= 57) {
                    checker = true;
                } else {
                    checker = false;
                    break;
                }
            }
            System.out.println(checker);
            }
}
