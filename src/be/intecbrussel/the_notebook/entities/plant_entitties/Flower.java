package be.intecbrussel.the_notebook.entities.plant_entitties;

public class Flower extends Plant{
    private Scent smell = Scent.MUSKEY; // sets default value for area if not changed

    public Flower(String name){
        this(name, 0.2);
    }

    public Flower(String name, double height) {
        super(name, height);
    }

    public Scent getSmell() {
        return smell;
    }

    public void setSmell(Scent smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return "Flower" + super.toString() + "{" +
                "smell=" + smell +
                '}';
    }
}
