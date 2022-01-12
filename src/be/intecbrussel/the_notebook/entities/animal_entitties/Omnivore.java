package be.intecbrussel.the_notebook.entities.animal_entitties;

import be.intecbrussel.the_notebook.entities.plant_entitties.Plant;

import java.util.LinkedHashSet;
import java.util.Set;

public class Omnivore extends Animal{
    private Set<Plant> plantDiet = new LinkedHashSet<>();
    private double maxFoodSize = getHeight() / 2; // sets default value

    public Omnivore(String name) {
        this(name, 50, 2,2);
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

    public void printDiet(){
        plantDiet.forEach(plant -> System.out.println(plant.getName()));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        plantDiet.forEach((plant -> sb.append('"').append(plant.getName()).append("\" ")));
        return "Omnivore"+ super.toString() + "{" +
                "plantDiet=" + sb +
                ", maxFoodSize=" + maxFoodSize +
                '}';
    }
}
