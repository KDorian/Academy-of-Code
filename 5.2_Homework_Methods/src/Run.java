/**
 * Created by DK on 13.03.2017.
 */
public class Run {
    public static void main(final String[] args) {

        int liczba1 = 5;
        int liczba2 = 10;

        int wynik = 0;

        wynik = suma(liczba1, liczba2);
        System.out.println(wynik);


        wynik = roznica(liczba1, liczba2);
        System.out.println(wynik);


        wynik = dziel(liczba1, liczba2);
        System.out.println(wynik);


        wynik = suma(liczba1, liczba2);
        System.out.println(wynik);


        rownanie_kwadratowe(2, 15, 3);


        double wynik2;

        double liczba3 = 5;
        double liczba4 = 6;

        wynik2 = obwodKwadrat(liczba3);
        System.out.println(wynik);

        wynik2 = poleTrapezu(3.2, 5.4, 7.0);
        System.out.println(wynik);

    }

    static int suma(int a, int b) {
        return a + b;
    }

    static int roznica(int a, int b) {
        return a - b;
    }


    static int dziel(int a, int b) {
        double wynik;
        if (b != 0) {
            return a / b;
        } else {
            return 0;
        }
    }

    static void rownanie_kwadratowe(int a, int b, int c) {
        System.out.println("Twoje równanie to");
        System.out.print(a);
        System.out.print("x^2+");
        System.out.print(b);
        System.out.print("x+");
        System.out.println(c);


        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("nie ma pierwiastkow");
        } else if (delta == 0) {
            System.out.println("x1:");
            System.out.println((-b) / (2 * a));
        } else if (delta > 0) {

            System.out.println("x1:");
            System.out.println((-b + Math.sqrt(delta)) / (2 * a));

            System.out.println("x2:");
            System.out.println((-b - Math.sqrt(delta)) / (2 * a));
        }
    }

    static double poleKwadrat(double a) {
        return a * a;
    }

    static double obwodKwadrat(double a) {
        return 4 * a;
    }

    static double poleProstokat(double a, double b) {
        return a * b;
    }

    static double obwodProstokat(double a, double b) {
        return 2 * a + 2 * b;
    }

    static double poleTrojkatProstokatny(double a, double h) {
        return a * h / 2;
    }

    static double obwodTrojkatProstokatny(double a, double b, double c) {
        return a + b + c;
    }

    static double poleTrapezu(double a, double b, double h) {
        return (a + b * h) / 2;
    }

    static double ObwodTrapezu(double a, double b, double c) {
        return a + b + 2 * c;
    }

}