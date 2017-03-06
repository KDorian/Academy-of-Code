import model.Dealer;

/**
 * Created by DK on 06.03.2017.
 */
public class Run {

        public static void main(final String[] args) {

            Dealer janusz = new Dealer();

            janusz.addToClass("Opel", 100);
            janusz.addToClass("Ford", 120);

            Dealer wieslaw = new Dealer();

            wieslaw.addToClass("Fiat", 80);
            wieslaw.addToClass("Skoda", 100);

            System.out.pritnln(carName + " u " + dealerName + "jest najtanszy.");

            }
}
