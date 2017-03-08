import java.util.Scanner;

/**
 * Created by DK on 09.03.2017.
 */
public class Exercise_5 {
    public static void main(final String[] args) {
        String word;
        char firstLetter = 'f';
        char lastLetter = 'l';
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
        int wordLength = word.length();
        for (int i = 0; i < wordLength; i++) {
            if (i == 0) {
                firstLetter = word.charAt(0);
            } else if (i == (wordLength - 1)) {
                lastLetter = word.charAt(wordLength - 1);
            } else {
                //do nothing
            }
        }
        if (firstLetter == lastLetter) {
            System.out.println("The first & last letter of the word are the same.");
        } else {
            System.out.println("The first & last letter of the word are different.");
        }
    }

}
