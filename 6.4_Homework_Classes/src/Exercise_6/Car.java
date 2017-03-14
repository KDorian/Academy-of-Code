package Exercise_6;

/**
 * Created by DK on 14.03.2017.
 */
public class Car {
    String mark;
    String model;
    double accelerationTime;

    public double getAccelerationTime()
    {
        return accelerationTime;
    }

    public Car(String Mark, String model, double accelerationTime)
    {
        this.mark = Mark;
        this.model = model;
        this.accelerationTime = accelerationTime;
    }

    public String getCarName()
    {
        return "Brand:"+ mark +" Model:"+model+" Acceleration rate:"+ accelerationTime;
    }
}
