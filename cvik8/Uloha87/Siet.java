package cvik8.Uloha87;

import java.util.List;
import java.util.LinkedList;

public class Siet {

    private List<Zariadenie> zariadenia = new LinkedList<>();

    public void pripojZariadenie(Zariadenie zariadenie) {
        zariadenia.add(zariadenie);
        zariadenie.oznamPripojenie(this);
    }

    public void odpojZariadenie(Zariadenie zariadenie) {
        zariadenia.remove(zariadenie);
        zariadenie.oznamOdpojenie(this);
    }

    public void notifikujVsetky() {
        for (Zariadenie zariadenie : zariadenia) {
            zariadenie.aktualizuj(this);
        }
    }
}
