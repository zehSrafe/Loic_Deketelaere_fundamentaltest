package be.intecbrussel.the_notebook.entities.plant_entitties;

public class Plant {
    private final String name;
    private double height;

    public Plant(String name){
        this(name, 0);
    }

    public Plant(String name, double height) {
        this.name = name;
        setHeight(height);
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = (height > 0) ? height : -height;
    }

    @Override
    public String toString() {
        return " '" + name + "' {" +
                "height=" + height +
                '}';
    }
}
