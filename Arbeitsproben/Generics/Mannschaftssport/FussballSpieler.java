package mannschaftssportGeneric;

public class FussballSpieler extends Spieler {

    private int geschosseneTore = 0;

    public FussballSpieler(String name) {

        super(name);

    }

    public void schiesseTor() {

        geschosseneTore++;

    }

    public int getGeschosseneTore() {
        return this.geschosseneTore;
    }

}
