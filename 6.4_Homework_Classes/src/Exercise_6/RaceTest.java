package Exercise_6;

/**
 * Created by DK on 14.03.2017.
 */
public class RaceTest {
    public static void main(String[] args)
    {
        Race race = new Race();

        Car car1 = new Car("Opel", "Astra", 6.2);
        Car car2 = new Car("Audi", "q7", 4.2);
        Car car3 = new Car("Mercedes", "W211", 2.2);

        race.addCar(car1);
        race.addCar(car2);

        race.start();

        System.out.println("Winner:  " + race.getCarWinner());



        race.addCar(car3);

        race.start();

        System.out.println("Winner:  " + race.getCarWinner());

    }

}
