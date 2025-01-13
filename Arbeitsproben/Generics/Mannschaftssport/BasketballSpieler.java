package mannschaftssportGeneric;
public class BasketballSpieler extends Spieler {

    private int geworfeneKoerbe = 0;

    public BasketballSpieler(String name) {

        super(name);

    }

    public void wirfKorb() {

        geworfeneKoerbe++;

    }

    public int getErzieltePunkte() {
        return this.geworfeneKoerbe;
    }

}
