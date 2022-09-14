public class Osoba {
    private int id;
    private String imie;
    public static int liczba_instancji = 0;

    public Osoba() {
        liczba_instancji += 1;
        this.id = 0;
        this.imie = "";
    }

    public Osoba(int id, String imie) {
        liczba_instancji += 1;
        this.id = id;
        this.imie = imie;
    }

    public Osoba(Osoba osoba) {
        this.imie = osoba.imie;
        this.id = osoba.id;
    }

    public void wypiszDane(String argument) {
        if (imie == "") {
            System.out.println("Brak danych");
        } else {
            System.out.println("Cześc " + argument + " mam na imię " + imie);
        }
    }

}
