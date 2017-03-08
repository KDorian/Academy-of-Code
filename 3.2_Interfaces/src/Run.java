import model.interfaces.SavingAccount;
import model.interfaces.Account;
import model.interfaces.Bank;
import model.interfaces.NormalAccount;


/**
 * Created by DK on 08.03.2017.
 */
public class Run {
    public static void main(final String[] args) {
        Account account1 = new SavingAccount("Saving", 1000);
        Account account2 = new NormalAccount("Normal", 3000);

        Bank bank = new Bank(account1, account2);

        bank.gain();
        bank.interest();
        bank.yearPassed();

        Account money = bank.yearPassed();
        System.out.println("The biggest aount of money is on: " + money.getName() + ".");
    }
}
