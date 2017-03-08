package model.interfaces;

/**
 * Created by DK on 08.03.2017.
 */
public class Bank {

    private Account[] accounts;

    public Bank(Account... accounts) {
        this.accounts = accounts;
    }

    public void gain() {
        for (Account account : accounts) {
            account.gain();
        }
    }

    public void interest() {
        for (Account account : accounts) {
            account.interest();
        }
    }

    public Account yearPassed() {
        double max = -100000;
        Account money = null;
        for (Account account : accounts) {
            if (account.getAmount() > max) {
                max = account.getAmount();
                money = account;
            }
        }
        return money;
    }
}
