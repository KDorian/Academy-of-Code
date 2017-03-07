/**
 * Created by DK on 08.03.2017.
 */
public class Person {
    private String name;
    private String surname;
    private int age;
    private String gender;

    public Person(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public void print() {
        System.out.print(name + surname + age + gender);
    }
}
