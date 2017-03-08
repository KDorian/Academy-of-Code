/**
 * Created by DK on 08.03.2017.
 */
public class Run {
    public static void main(final String[] args) {
        Person kuba = new Person("kuba", "kowalski");
        System.out.println("we are in main method");
        String kubaName = kuba.getName();
        System.out.println("this is kubaName: " + kubaName);
        System.out.println("this is kuba.getName(): " + kuba.getName());

        kubaName = "Pawel";
        System.out.println("this is kubaName: " + kubaName);
        System.out.println("this is kuba.getName(): " + kuba.getName());
    }
}
