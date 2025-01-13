package mannschaftssportGeneric;

public class Main {
    public static void main(String[] args) {
        // Erstellen einer Fussballmannschaft
        MannschaftGenerisch<FussballSpieler> fussballMannschaft = new MannschaftGenerisch<>("FC Bayern München");

        // Erstellen von Fussballspielern
        FussballSpieler spieler1 = new FussballSpieler("Thomas Müller");
        FussballSpieler spieler2 = new FussballSpieler("Robert Lewandowski");

        // Spieler in die Mannschaft aufnehmen
        fussballMannschaft.aufnehmen(spieler1);
        fussballMannschaft.aufnehmen(spieler2);

        // Tore schießen
        spieler1.schiesseTor();
        spieler2.schiesseTor();
        spieler2.schiesseTor();

        // Ausgabe der Fussballmannschaft
        System.out.println("Fussballmannschaft:");
        fussballMannschaft.ausgabe();
        System.out.printf("Tore von %s: %d\n", spieler1.getName(), spieler1.getGeschosseneTore());
        System.out.printf("Tore von %s: %d\n", spieler2.getName(), spieler2.getGeschosseneTore());

        // Erstellen einer Basketballmannschaft
        MannschaftGenerisch<BasketballSpieler> basketballMannschaft = new MannschaftGenerisch<>("Los Angeles Lakers");

        // Erstellen von Basketballspielern
        BasketballSpieler spieler3 = new BasketballSpieler("LeBron James");
        BasketballSpieler spieler4 = new BasketballSpieler("Anthony Davis");

        // Spieler in die Mannschaft aufnehmen
        basketballMannschaft.aufnehmen(spieler3);
        basketballMannschaft.aufnehmen(spieler4);

        // Körbe werfen
        spieler3.wirfKorb();
        spieler3.wirfKorb();
        spieler4.wirfKorb();

        // Ausgabe der Basketballmannschaft
        System.out.println("\nBasketballmannschaft:");
        basketballMannschaft.ausgabe();
        System.out.printf("Punkte von %s: %d\n", spieler3.getName(), spieler3.getErzieltePunkte());
        System.out.printf("Punkte von %s: %d\n", spieler4.getName(), spieler4.getErzieltePunkte());
    }
}
