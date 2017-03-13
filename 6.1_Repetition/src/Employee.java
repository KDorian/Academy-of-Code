/**
 * Created by DK on 13.03.2017.
 */
public class Employee implements Showable{
    private String name;
    private String surname;
    private int age;

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String show() {
        String result = (name + " " + surname + " " + age);
        System.out.println(result);
        return result;
    }
}
