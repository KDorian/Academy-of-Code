import javax.swing.*;

/**
 * Created by DK on 07.03.2017.
 */
public class Fighter {

    private String name;
    private int agression;
    private int strength;
    private int tactics;

    public Fighter(String name, int agression, int strength, int tactics) {
        this.name = name;
        this.agression = agression;
        this.strength = strength;
        this.tactics = tactics;
    }

    public String getName() {
        return name;
    }

    public int getAgression() {
        return agression;
    }

    public int getStrength() {
        return strength;
    }

    public int getTactics() {
        return tactics;
    }

    public void training() {
        strength++;
        tactics--;
    }

    public void addingWarrior(String name){
        JOptionPane.showMessageDialog(null, "Dodanym wojownikiem jest" + name.getName());
    }
}
