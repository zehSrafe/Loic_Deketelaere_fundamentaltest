package be.intecbrussel.the_notebook.entities.animal_entitties;

public class Carnivore extends Animal{
    private double maxFoodSize = getHeight() / 2; // sets default value

    public Carnivore(String name) {
        this(name, 40, 1.2, 2);
    }

    public Carnivore(String name, double weight, double height, double lemgth) {
        super(name, weight, height, lemgth);
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return "Carnivore"+ super.toString() + "{" +
                "maxFoodSize=" + maxFoodSize +
                '}';
    }
}
