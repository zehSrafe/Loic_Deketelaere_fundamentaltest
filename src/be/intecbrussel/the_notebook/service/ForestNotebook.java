package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entitties.Animal;
import be.intecbrussel.the_notebook.entities.animal_entitties.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entitties.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entitties.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entitties.Plant;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ForestNotebook {
    private List<Carnivore> carnivores = new LinkedList<>();
    private List<Omnivore> omnivores = new LinkedList<>();
    private List<Herbivore> herbivores = new LinkedList<>();
    private int plantCount = 0;
    private int animalCount = 0;
    private List<Animal> animals = new LinkedList<>();
    private List<Plant> plants = new LinkedList<>();

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void addPlant(Plant plant){
        if (!plants.contains(plant)){
            plants.add(plant);
            plantCount++;
        } else {
            System.out.println("Plant '" + plant.getName() + "' already in notebook");
        }
    }

    public void addAnimal(Animal animal){
        if (!animals.contains(animal)) {
            animals.add(animal);
            animalCount ++;
            if (Carnivore.class.equals(animal.getClass())) {
                carnivores.add((Carnivore) animal);
            } else if (Omnivore.class.equals(animal.getClass())) {
                omnivores.add((Omnivore) animal);
            } else if (Herbivore.class.equals(animal.getClass())) {
                herbivores.add((Herbivore) animal);
            } else {
                System.out.println("Uncategorised entity");
            }
        } else {
            System.out.println(animal.getClass().getSimpleName() + " animal '" + animal.getName() + "' already in notebook");
        }

    }

    public void printNotebook(){
        System.out.println("Registered animals:");
        animals.forEach(System.out::println);
        System.out.println("");
        System.out.println("Registered plants:");
        plants.forEach(System.out::println);
    }

    public void sortAnimalsByName(){
        animals = animals.stream()
                .sorted(Comparator.comparing(Animal::getName))
                .collect(Collectors.toList());
    }

    public void sortAnimalsByHeight(){
        animals = animals.stream()
                .sorted(Comparator.comparing(Animal::getHeight))
                .collect(Collectors.toList());
    }

    public void sortPlantsByName(){
        plants = plants.stream()
                .sorted(Comparator.comparing(Plant::getName))
                .collect(Collectors.toList());
    }

    public void sortPlantsByHeight(){
        plants = plants.stream()
                .sorted(Comparator.comparing(Plant::getHeight))
                .collect(Collectors.toList());
    }
}
