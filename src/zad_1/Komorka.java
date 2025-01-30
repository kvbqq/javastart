package zad_1;

import java.awt.*;

public class Komorka extends Telefon{
    private static final int SIZE = 6;

    private String[] ostatniePolaczenia = new String[SIZE];
    private int i;

    public Komorka(String interfejsKomunikacyjny, Color color) {
        super(interfejsKomunikacyjny, color);
        this.i = 0;
    }

    public String[] getOstatniePolaczenia() {
        return ostatniePolaczenia;
    }

    public void setOstatniePolaczenia(String[] ostatniePolaczenia) {
        this.ostatniePolaczenia = ostatniePolaczenia;
    }

    @Override
    public void zadzwon(String number) {
        super.zadzwon(number);
        ostatniePolaczenia[i] = number;
        i = (i + 1)%SIZE;
    }

    @Override
    public void wyswietlHistoriePolaczen() {
        for (String number : ostatniePolaczenia) {
            System.out.println(number);
        }
    }
}
