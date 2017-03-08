package model.interfaces;

/**
 * Created by DK on 08.03.2017.
 */
public class NormalAccount implements Account {
    private double amount;
    private String name;

    public NormalAccount(String name) {
        this.name = name;
        amount = 0;
    }

    @Override
    public void gain() {
        amount += 6000;
    }

    @Override
    public void interest() {
        amount = 0;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String getName() {
        return name;
    }
}
