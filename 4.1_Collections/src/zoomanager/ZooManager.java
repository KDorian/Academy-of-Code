package zoomanager;

import animal.Animal;

import java.util.*;

/**
 * Created by DK on 09.03.2017.
 */
public class ZooManager {

    // Collections

    List<Animal> animalList = new ArrayList<>();

    public void addAnimal(String animalType, String animalName, String animalSex) {
        Animal animal = new Animal(animalType, animalName, animalSex);
        animalList.add(animal);
    }

    public void print() {
       for (Animal animalName : animalList) {
           System.out.println(animalName);
       }
    }

    // Maps

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

    // Sets

//    Set<animal.Animal> animalSet = new Set<>;
}
