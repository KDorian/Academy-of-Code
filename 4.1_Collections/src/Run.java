/**
 * Created by DK on 09.03.2017.
 */
public class Run {
    public static void main(final String[] args) {

        Animal animal1 = new Animal("Monkey", "Pipi");
        Animal animal2 = new Animal("Lion", "Pinky");
        Animal animal3 = new Animal("Tiger", "Napoleon");
        Animal animal4 = new Animal("Monkey", "Java");

        ZooManager zooManager = new ZooManager();
        zooManager.addAnimal(animal1);
        zooManager.addAnimal(animal2);
        zooManager.addAnimal(animal3);
        zooManager.addAnimal(animal4);

        zooManager.putAnimal(animal1);
        zooManager.putAnimal(animal2);
        zooManager.putAnimal(animal3);
        zooManager.putAnimal(animal4);

//        ZooManager.print();

        Animal animalHashed = zooManager.quickGetByName("Pipi");
        System.out.println(animalHashed.toString());

    }
}
