package be.intecbrussel.the_notebook.entities.plant_entitties;

public class Tree extends Plant{
    private LeafType leafType = LeafType.UNKNOWN; // sets default value

    public Tree(String name) {
        this(name, 5);
    }

    public Tree(String name, double height) {
        super(name, height);
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return "Tree" + super.toString() + "{" +
                "leafType=" + leafType +
                '}';
    }
}
