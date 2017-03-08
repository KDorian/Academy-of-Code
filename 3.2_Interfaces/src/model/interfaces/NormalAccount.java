package model.interfaces;

/**
 * Created by DK on 08.03.2017.
 */
public class NormalAccount implements Account {
    private double amount;
    private String name;

    public NormalAccount(String name, double amount) {
        this.name = name;
        this.amount = amount;

    }

    @Override
    public void gain() {
        amount = amount + 12*6000;
    }

    @Override
    public void interest() {
        amount = amount + amount*0.01;
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
