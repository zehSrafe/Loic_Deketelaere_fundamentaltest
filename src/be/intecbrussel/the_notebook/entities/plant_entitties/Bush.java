package be.intecbrussel.the_notebook.entities.plant_entitties;

public class Bush extends Plant{
    private String fruit;
    private LeafType leaftype;

    public Bush(String name){
        super(name);
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
        return "Bush '" + super.getName() + "'{" +
                "fruit='" + fruit + '\'' +
                ", leaftype='" + leaftype + '\'' +
                '}';
    }
}
