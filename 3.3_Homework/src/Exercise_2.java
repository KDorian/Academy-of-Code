/**
 * Created by DK on 08.03.2017.
 */
public class Exercise_2 {
        public static void main(final String[] args) {

                String sentence = "Alamakota";
                int amountLastLetter = 3;
                int sentenceLength = sentence.length();
                for(int i =0; i < amountLastLetter; i++) {
                    System.out.print(sentence.charAt((sentenceLength - (amountLastLetter - i))));
                }
            }
}
