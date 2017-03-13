/**
 * Created by DK on 13.03.2017.
 */
public class Rectangle extends Figure {

    public Rectangle(double a, double b) {
        super(a,b);
    }

    @Override
    public double getArea() {
        return a*b;
    }


    @Override
    public double resize(){
        return a*b;
    }

}
