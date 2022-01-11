package be.intecbrussel.the_notebook.entities.animal_entitties;

public class Animal {
    private String name;
    private double weight;
    private double height;
    private double lemgth;

    public Animal(String name) {
        this(name, 2.5, 2.5, 2.5);
    }

    public Animal(String name, double weight, double height, double lemgth) {
        this.name = name;
        setWeight(weight);
        setHeight(height);
        setLemgth(lemgth);
    }

    public void setWeight(double weight) {
        this.weight = (weight > 0) ? weight : -weight;
    }

    public void setHeight(double height) {
        this.height = (height > 0) ? height : -height;
    }

    public void setLemgth(double lemgth) {
        this.lemgth = (lemgth > 0) ? lemgth : -lemgth;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getLemgth() {
        return lemgth;
    }

    @Override
    public String toString() {
        return " '" + name + "' {" +
                " weight=" + weight +
                ", height=" + height +
                ", lemgth=" + lemgth +
                " }";
    }
}
