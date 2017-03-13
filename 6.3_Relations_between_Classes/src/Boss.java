/**
 * Created by DK on 13.03.2017.
 */
public class Boss extends Worker{
    private String department;

    public Boss(String name, String surname, int salary, String department) {
        super(name, surname, salary);
        this.department = department;
    }
}
