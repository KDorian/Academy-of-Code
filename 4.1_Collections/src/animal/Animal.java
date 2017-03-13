package animal;

/**
 * Created by DK on 09.03.2017.
 */
public class Animal {
    private String type;
    private String name;
    private String sex;

    public Animal(String type, String name, String sex) {
        this.type = type;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "This is " + type + " " + name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }
}
