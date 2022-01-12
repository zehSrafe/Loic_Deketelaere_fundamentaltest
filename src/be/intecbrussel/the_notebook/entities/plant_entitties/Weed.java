package be.intecbrussel.the_notebook.entities.plant_entitties;

public class Weed extends Plant{
    private double area = 6;    // sets default value

    public Weed(String name){
        super(name, 0.42);
    }

    public Weed(String name, double height) {
        super(name, height);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Weed" + super.toString() + "{" +
                "area=" + area +
                '}';
    }
}
