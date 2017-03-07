/**
 * Created by DK on 07.03.2017.
 */
public class Run {
        public static void main(final String[] args) {

            Fighter tyson = new Fighter("mike", 100, 99, 40);
            Fighter andrew = new Fighter("Andrzej", 1000, 1000, 1000);

            showFigther(tyson);
            showFigther(andrew);

            andrew.training();
            andrew.training();
            andrew.training();
            andrew.training();

            showFigther(tyson);
            showFigther(andrew);

        }

    private static void showFigther(Fighter fighter) {
        System.out.println(fighter.getName());
        System.out.println(" Aggression: " + fighter.getAgression());
        System.out.println(" Strength: " + fighter.getStrength());
        System.out.println(" Tactics: " + fighter.getTactics());
    }
}
