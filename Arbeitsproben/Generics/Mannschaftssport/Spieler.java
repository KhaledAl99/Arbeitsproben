package mannschaftssportGeneric;

public abstract class Spieler {

    private final String name;

    public Spieler(String name) {
        this.name = name;
    }

    public String getName() {

        return this.name;

    }

}
