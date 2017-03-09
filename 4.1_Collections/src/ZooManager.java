import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by DK on 09.03.2017.
 */
public class ZooManager {

    List<Animal> animalList = new ArrayList<>();

    void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public void print() {
       for (Animal animalName : animalList) {
           System.out.println(animalName);
       }
    }

    private Map<String, Animal> typeToAnimal;
    private Map<String, Animal> nameToAnimal;

    public ZooManager() {
        typeToAnimal = new HashMap<>();
        nameToAnimal = new HashMap<>();
    }

    public void putAnimal(Animal animal) {
        typeToAnimal.put(animal.getType(), animal);
        nameToAnimal.put(animal.getName(), animal);
    }

    public Animal quickGetByType(String type) {
        return typeToAnimal.get(type);
    }

    public Animal quickGetByName(String name) {
        return nameToAnimal.get(name);
    }
}
