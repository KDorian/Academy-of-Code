/**
 * Created by DK on 07.03.2017.
 * Checking if postcode is correct.
 */
public class Run3 {
    public static void main(final String[] args) {
        String s = "025345";
        char[] tab = s.toCharArray();
        boolean checker = true;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] >= 48 && tab[i] <= 57 && i != 2 && tab.length == 6) {
                checker = true;
            } else if (i == 2 && tab[i] == 45) {
                checker = true;
            } else {
                checker = false;
                break;
            }
        }
        System.out.println(checker);
    }
}
