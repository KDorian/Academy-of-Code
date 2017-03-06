/**
 * Created by DK on 07.03.2017.
 */
public class Exercise_4 {
        public static void main(final String[] args) {
             int a = -9;
             int b = 3;
             int c = -5;
             int x;
             if(a<b && a<c) {
                 x = a;
             }
             else if(b<c && b<a){
                 x = b;
             }
             else {
                 x = c;
             }

             System.out.println(x);
            }
}
