/**
 * Created by DK on 07.03.2017.
 */
public class Run2 {
        public static void main(final String[] args) {
             String word = "Assm";
//             String word1 = "AssM";
//             String word2 = "Assm";
             String word3 = "Wssa";


             if((word.endsWith("M")||(word.endsWith("m")))){
                 System.out.println("Yes");
             } else if (word.equals(word3)) {
                 System.out.println("No");
             } else {
                 System.out.println("No idea");
             }
            }
}
