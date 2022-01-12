package be.intecbrussel.the_notebook.entities.plant_entitties;

public enum Scent {
    SWEET("Sweet"), ORANGE("Orange"), PINAPPLE("Pinapple"), MUSKEY("Muskey"), EARTHY("Earthy"), SOUR("Scour"), UNKNOWN("Unkown");

    private final String scent;

    Scent(String scent){
        this.scent = scent;
    }

    @Override
    public String toString() {
        return scent;
    }
}
