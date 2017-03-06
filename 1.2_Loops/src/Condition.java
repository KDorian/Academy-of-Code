/**
 * Created by DK on 06.03.2017.
 */
public class Condition {
    public static void main(final String[] args) {

        //wypisz wszystkie liczby z wybranego zakresu
//                int a = 20;
//                int b = 30;
//                for(int i=a; i<(b+1); i++){
//                    System.out.println(i);
//                }


        //wypisz namniejsza i najwieksza liczbe z tablicy
//        int[] table = {3, 5, 7, 8};
//        final int length = table.length;
//        int x = table[0];
//        for (int i = 0; i < length; i++) {
//            if (x > table[i]) {
//                x = table[i];
//            }
//        }
//        System.out.println("Najmniejsza liczba w tablicy to: " + x);
//
//        int y = table[0];
//        for (int i = 0; i < length; i++) {
//            if (y < table[i]) {
//                y = table[i];
//            }
//        }
//        System.out.println("Najwieksza liczba w tablicy to: " + y);

        //wypisz liczby z ciagu fibanacciego

        int n = 46;
        int x = 1;
        int y = 1;
        int[] c = new int[n];
        c[0] = x;
        c[1] = y;

        for (int i = 1; i < n; i++) {

            c[i] = y;
            y += x;
            x = y - x;

        }
        for (int j = 0; j < n; j++) {
            System.out.println(c[j]);
        }


    }

}
