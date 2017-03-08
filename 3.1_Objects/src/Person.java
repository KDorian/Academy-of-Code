/**
 * Created by DK on 08.03.2017.
 */
public class Person {
    private final int age;
    private String name;
    private String surname;

    public Person(String name, String surname) {

        age = 40;
        System.out.println("we are in constructor");
        System.out.println("name:" + name);
        System.out.println("this name before:" + this.name);
        this.name = name;
        this.surname = surname;

        System.out.println("This name after:" + this.name);
        System.out.println("local variable: " + age);
    }

    public String getName() {
        System.out.println("we are in getter" + name);
        System.out.println(age);
        return name;
    }

    public String getSurname() {
        return surname;
    }


}
