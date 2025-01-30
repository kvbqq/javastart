package zad_1;

import java.awt.*;

public class Telefon {
    private String interfejsKomunikacyjny;
    private Color color;

    public Telefon(String interfejsKomunikacyjny, Color color) {
        this.interfejsKomunikacyjny = interfejsKomunikacyjny;
        this.color = color;
    }

    public String getInterfejsKomunikacyjny() {
        return interfejsKomunikacyjny;
    }

    public void setInterfejsKomunikacyjny(String interfejsKomunikacyjny) {
        this.interfejsKomunikacyjny = interfejsKomunikacyjny;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void zadzwon(String number) {
        System.out.println(number);
    }

    public void wyswietlHistoriePolaczen() {
        System.out.println("brak historii");
    }

}
