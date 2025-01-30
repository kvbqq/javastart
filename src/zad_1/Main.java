package zad_1;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Telefon[] telefony = new Telefon[3];

        Osoba[] znajomi = {
                new Osoba("Jan", "Kowalski", "111-111-111"),
                new Osoba("Anna", "Nowak",    "222-222-222"),
                new Osoba("Piotr", "Zalewski","333-333-333")
        };

        telefony[0] = new Telefon("Stacjonarny", Color.BLACK);
        telefony[1] = new Komorka("GSM", Color.WHITE);
        telefony[2] = new Smartfon("LTE", Color.BLUE, znajomi);

        String[] numery = {
                "123-123-123",
                "111-111-111",
                "123-456-789",
                "222-222-222",
                "432-654-123",
                "333-333-333"
        };

        for (Telefon telefon : telefony) {
            for (String numer : numery) {
                telefon.zadzwon(numer);
            }
            telefon.wyswietlHistoriePolaczen();
        }

    }
}
