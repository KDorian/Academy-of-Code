package Exercise_1;

/**
 * Created by DK on 14.03.2017.
 */

public class Bulb {
    int vitality = 0;
    int power = 0;

    public Bulb() {
        System.out.println("Creating object Bulb - constructor without parameters");
    }

    public Bulb(int vitality, int power) {
        System.out.println("Creating object Bulb - constructor with parameters");
        this.vitality = vitality;
        this.power = power;
    }

    public void getBulbName() {
        if (vitality == 0 || power == 0) {
            System.out.println("Your bulb will not work. It has 0 power and 0 vitality.");
        } else {
            System.out.println("Your bulb has " + vitality + "h of vitality left and " + power + "W of power.");
        }
    }
}