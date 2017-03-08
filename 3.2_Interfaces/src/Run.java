/**
 * Created by DK on 08.03.2017.
 */
public class Run {
        public static void main(final String[] args) {
                Account saving = new SavingAccount(3);
                Account normal = new NormalAccount(6);

                Bank bank = new Bank(saving, normal);

                bank.gain();
                bank.interest();
                bank.print();
        }
}
