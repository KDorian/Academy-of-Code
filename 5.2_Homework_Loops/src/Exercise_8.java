/**
 * Created by DK on 13.03.2017.
 */
public class Exercise_8 {
    public static void main(String[] args)
    {

        first:
        for (int i = 1; i <= 30; i++)
        {
            System.out.println("First:" + i);

            second:
            for (int k = 1; k <= 10; k++)
            {
                System.out.println("Second:" + k);

                if(i ==15 && k ==3)
                    break first;
            }

        }
    }
}
