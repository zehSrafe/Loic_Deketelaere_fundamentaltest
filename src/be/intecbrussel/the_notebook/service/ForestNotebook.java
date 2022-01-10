package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entitties.Animal;
import be.intecbrussel.the_notebook.entities.animal_entitties.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entitties.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entitties.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entitties.Plant;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class ForestNotebook {
    private List<Carnivore> carnivores = new LinkedList<>();
    private List<Omnivore> omnivores = new LinkedList<>();
    private List<Herbivore> herbivores = new LinkedList<>();
    private static int plantCount = 0;
    private static int animalCount = 0;
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
        plants.add(plant);
        plantCount++;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
        if (animal.getClass() == Carnivore.class){
            carnivores.add((Carnivore) animal);
        } else if (animal.getClass() == Omnivore.class){
            omnivores.add((Omnivore) animal);
        } else if (animal.getClass() == Herbivore.class){
            herbivores.add((Herbivore) animal);
        } else {
            System.out.println("Uncategorised entity");
        }
        animalCount++;
    }

    public void printNotebook(){
        System.out.println("Registered animals:");
        animals.forEach(System.out::println);
        System.out.println("");
        System.out.println("Registered plants:");
        plants.forEach(System.out::println);
    }

    public void sortAnimalsByName(){
        animals = List.of((Animal[]) Stream.of((Animal[]) animals.toArray())
                .sorted(Comparator.comparing(Animal::getName))
                .toArray());
    }

    public void sortPlantsByName(){
        plants = List.of((Plant[]) Stream.of((Plant[]) plants.toArray())
                .sorted(Comparator.comparing(Plant::getName))
                .toArray());
    }
}
