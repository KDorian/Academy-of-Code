/**
 * Created by DK on 13.03.2017.
 */
public abstract class A {

    public abstract void authorize();
    public abstract void sendReport();

    public void mainProcess() {
        authorize();

        for(int i = 2; i <= 100; i+=2)
            System.out.println(i);

        sendReport();
    }
}
