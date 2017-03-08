package model.interfaces;

/**
 * Created by DK on 08.03.2017.
 */
public class SavingAccount implements Account {
    private double amount;
    private String name;

    public SavingAccount(String name) {
        this.name = name;
        amount = 0;
    }

    @Override
    public void gain() {
        amount = 0;
    }

    @Override
    public void interest() {
        amount = amount+(amount*0.1);
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
