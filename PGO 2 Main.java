import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

    }
}

class Ksiazka{
    static long id;
    String nazwa;
    Gatunek gatunek;
    Jezyk jezyk;
    LocalDate data_wydania;
    int licznikWypozyczen;
    boolean czyDostepna;

    public Ksiazka(String nazwa, Gatunek gatunek, Jezyk jezyk, LocalDate data_wydania){
        this.id += id;
        this.nazwa = nazwa;
        this.gatunek = gatunek;
        this.jezyk = jezyk;
        this.data_wydania = data_wydania;
        licznikWypozyczen = 0;
        czyDostepna = true;
    }

    public void WypozyczKsiazke(Osoba osoba){
        if(czyDostepna){
            osoba.ksiazki[0] = Ksiazka.this;
            czyDostepna = false;
            licznikWypozyczen = licznikWypozyczen + 1;
        } else {
            System.out.println("Książka jest niedostępna do wypożyczenia.");
        }
    }

    public void ZwrocKsiazke(){

    }
}

class Osoba{
    String imie;
    String nazwisko;
    LocalDate data_urodzenia;
    Ksiazka[] ksiazki = new Ksiazka[1];

    public Osoba(String imie, String nazwisko, LocalDate data_urodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data_urodzenia = data_urodzenia;
    }

    public Ksiazka PublikujKsiazke(String nazwa, Gatunek gatunek, Jezyk jezyk, LocalDate data_wydania){
        return new Ksiazka(nazwa,gatunek,jezyk,data_wydania);

    }
}

class Adres{
    String kraj;
    String miasto;
    String ulica;
    int numerDomu;
    int numerMieszkania;

    public Adres(String kraj, String miasto, String ulica, int numerDomu, int numerMieszkania) {
        this.kraj = kraj;
        this.miasto = miasto;
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
    }
}

