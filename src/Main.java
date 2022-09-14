import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Liczba zarejestrowanych osób "+Osoba.liczba_instancji);

        Osoba osoba1 = new Osoba();
        Scanner klawiakura = new Scanner(System.in);
        System.out.println("podaj imie");
        String imieWczytane = klawiakura.next();
        System.out.println("podaj id");
        int idWczytane = klawiakura.nextInt();

        Osoba osoba2 = new Osoba(idWczytane,imieWczytane);
        Osoba osoba3 = new Osoba(osoba2);
        //wczytywanie z klawiatury

        osoba1.wypiszDane("Jan");

        osoba2.wypiszDane("Jan");
        osoba3.wypiszDane("Jan");
        System.out.println("Liczba zarejestrowanych osób "+Osoba.liczba_instancji);

    }
}