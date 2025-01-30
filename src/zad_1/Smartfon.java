package zad_1;

import java.awt.*;

public class Smartfon extends Komorka{
    private Osoba[] znajomi;
    public Smartfon(String interfejsKomunikacyjny, Color color, Osoba[] znajomi) {
        super(interfejsKomunikacyjny, color);
        this.znajomi = znajomi;
    }

    public Osoba[] getZnajomi() {
        return znajomi;
    }

    public void setZnajomi(Osoba[] znajomi) {
        this.znajomi = znajomi;
    }

    @Override
    public void wyswietlHistoriePolaczen() {
        for (String number : getOstatniePolaczenia()) {
            Osoba tempOsoba = znajdzOsobe(number);
            System.out.println(tempOsoba == null ? number : tempOsoba);
        }
    }

    private Osoba znajdzOsobe(String numer) {
        for (Osoba osoba : znajomi) {
            if (osoba.getNumer().equals(numer))
                return osoba;
        }
        return null;
    }
}
