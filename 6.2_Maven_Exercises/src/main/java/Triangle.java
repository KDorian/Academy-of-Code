/**
 * Created by DK on 13.03.2017.
 */
public class Triangle extends Figure {

    public Triangle(double a, double b) {
        super(a,b);
    }

    @Override
    public double getArea() {
        return ((a*b)/2);
    }

    public static void resize(Triangle tr, double val){
        tr.setA(tr.getA()*val);
        tr.setB(tr.getB()*val);
    }

}
