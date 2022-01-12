package be.intecbrussel.the_notebook.entities.plant_entitties;

public class Bush extends Plant{
    private String fruit = "None";           // sets default value
    private LeafType leaftype = LeafType.UNKNOWN; // sets default value

    public Bush(String name){
        this(name, 1);
    }

    public Bush(String name, double height) {
        super(name, height);
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public LeafType getLeaftype() {
        return leaftype;
    }

    public void setLeaftype(LeafType leaftype) {
        this.leaftype = leaftype;
    }

    @Override
    public String toString() {
        return "Bush" + super.toString() + "{" +
                "fruit='" + fruit + '\'' +
                ", leaftype='" + leaftype + '\'' +
                '}';
    }
}
