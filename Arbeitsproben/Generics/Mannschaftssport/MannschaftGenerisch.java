package mannschaftssportGeneric;

import java.util.ArrayList;

public class MannschaftGenerisch<T extends Spieler> {

    private final String name;
    private final ArrayList<T> mannschaft = new ArrayList<>();

    public MannschaftGenerisch(String name) {

        this.name = name;

    }

    public void aufnehmen(T spieler) {

        mannschaft.add(spieler);

    }

    public void rausschmeissen(T spieler) {

        mannschaft.remove(spieler);

    }

    public void auswechseln(T spielerAlt, T spielerNeu) {

        rausschmeissen(spielerAlt);
        aufnehmen(spielerNeu);

    }

    public void ausgabe() {

        System.out.printf("----------%s----------\n", this.name);
        for (Spieler s : mannschaft) {
            System.out.printf("------%s------\n", s.getName());
        }

    }

}
