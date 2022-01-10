package be.intecbrussel.the_notebook.entities.animal_entitties;

import be.intecbrussel.the_notebook.entities.plant_entitties.Plant;

import java.util.LinkedHashSet;
import java.util.Set;

public class Omnivore extends Animal{
    Set<Plant> plantDiet = new LinkedHashSet<>();
    private double maxFoodSize;

    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double lemgth) {
        super(name, weight, height, lemgth);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    public void addPlantToDiet(Plant plant){
        plantDiet.add(plant);
    }

    @Override
    public String toString() {
        return "Omnivore '"+ super.getName() + "'{" +
                "plantDiet=" + plantDiet +
                ", maxFoodSize=" + maxFoodSize +
                '}';
    }
}
