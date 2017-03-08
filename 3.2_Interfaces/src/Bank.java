import model.interfaces.Account;

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

    public double yearPassed() {
        double money = 0;
        for (Account account : accounts) {
            money = money + account.getAmount();
        }
        return money;
    }
}
