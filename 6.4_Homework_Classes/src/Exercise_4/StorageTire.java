package Exercise_4;

import Exercise_3.Tire;

import java.util.HashMap;

/**
 * Created by DK on 14.03.2017.
 */
public class StorageTire {
    HashMap<String, Tire> myMap = new HashMap<String, Tire>();

    Tire tire;
    int z;
    int x;
    int y;

    public void addTire(Tire tire, int z, int x, int y)
    {
        this.tire = tire;
        this.z = z;
        this.x = x;
        this.y = y;
        if (myMap.get(x+"/"+y+"/"+z) == null)
        {
            myMap.put(x + "/" + y + "/" + z, tire);
            System.out.println("Added tire!");
        }
        else
        {
            System.out.println("This place is occupied!");
        }
    }


    public Tire getTire(int x, int y, int z)
    {
        return myMap.get(x+"/"+y+"/"+z);
    }
}
