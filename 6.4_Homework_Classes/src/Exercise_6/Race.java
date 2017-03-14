package Exercise_6;

import java.util.ArrayList;

/**
 * Created by DK on 14.03.2017.
 */
public class Race {
    private Car Winner;
    private ArrayList<Car> cars = new ArrayList<>();

    public Car getCarWinner()
    {
        return Winner;
    }

    public void addCar(Car zawodnik)
    {
        cars.add(zawodnik);
    }

    public void getNameAllCar()
    {
        for (Car car : cars)
        {
            car.getCarName();
        }
    }
    public void  start()
    {
        Car tmp = cars.get(0);

        for (Car car : cars)
        {
            if (car.getAccelerationTime() < tmp.getAccelerationTime())
            {
                tmp = car;
            }

        }

        Winner = tmp;
    }
}
