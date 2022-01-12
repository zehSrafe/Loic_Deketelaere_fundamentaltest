package be.intecbrussel.the_notebook.entities.plant_entitties;

public enum LeafType {
    NEEDLE("Needle"), ROUND("Round"), HAND("Hand"), HEART("Heart"), SPEAR("Spear"), UNKNOWN("Unknown");

    private final String leaftype;

    LeafType(String leaftype){
        this.leaftype = leaftype;
    }

    @Override
    public String toString() {
        return leaftype;
    }
}
