/**
 * Created by DK on 13.03.2017.
 */
public class Triangle extends Figure {
    protected int size;

    public Triangle(double a, double b, int size) {
        super(a,b);
        this.size = size;
    }

    @Override
    public double getArea() {
        return ((a*b)/2);
    }

    @Override
    public double resize(){
        return ((a*b)/2)*size;
    }

}
