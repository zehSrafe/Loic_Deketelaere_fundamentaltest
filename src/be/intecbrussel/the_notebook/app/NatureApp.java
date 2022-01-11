package be.intecbrussel.the_notebook.app;

import be.intecbrussel.the_notebook.entities.animal_entitties.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entitties.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entitties.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entitties.*;
import be.intecbrussel.the_notebook.service.ForestNotebook;

import java.util.LinkedHashSet;
import java.util.Set;

public class NatureApp {
    public static void main(String[] args) {
        Set<Plant> plantDiet = new LinkedHashSet<>();
        ForestNotebook notebook = new ForestNotebook();
        Bush bush = new Bush("yBush");
        Bush abush = new Bush("aBush");
        Flower flower = new Flower("lili of the valley");
        Tree tree = new Tree("tallTree");
        Weed weed = new Weed("G13");
        Weed weedPlant = new Weed("Gorilla glue");

        plantDiet.add(weedPlant);
        plantDiet.add(weed);

        Carnivore blue = new Carnivore("Blue from jurassic world", 1, 1, 1);
        Carnivore trex = new Carnivore("Tyrannosaurus");
        Carnivore giganotosaurus = new Carnivore("Giganotosaurus");
        Herbivore diplodocus = new Herbivore("Diplodocus");
        Herbivore theropods = new Herbivore("Theropods");
        Herbivore giraffatitan = new Herbivore("Giraffatitan");
        Omnivore khaan = new Omnivore("Khaan");
        Omnivore avimimus = new Omnivore("Avimimus");
        Omnivore nomingia = new Omnivore("Nomingia");
        diplodocus.setPlantDiet(plantDiet);
        theropods.setPlantDiet(plantDiet);
        giraffatitan.setPlantDiet(plantDiet);
        khaan.setPlantDiet(plantDiet);
        avimimus.setPlantDiet(plantDiet);
        nomingia.setPlantDiet(plantDiet);


        notebook.addPlant(bush);
        notebook.addPlant(bush);
        notebook.addPlant(abush);
        notebook.addPlant(flower);
        notebook.addPlant(tree);
        notebook.addPlant(weed);
        notebook.addPlant(weedPlant);
        notebook.addAnimal(blue);
        notebook.addAnimal(trex);
        notebook.addAnimal(trex);
        notebook.addAnimal(giganotosaurus);
        notebook.addAnimal(diplodocus);
        notebook.addAnimal(diplodocus);
        notebook.addAnimal(theropods);
        notebook.addAnimal(giraffatitan);
        notebook.addAnimal(khaan);
        notebook.addAnimal(khaan);
        notebook.addAnimal(avimimus);
        notebook.addAnimal(nomingia);

        notebook.printNotebook();
        System.out.println(notebook.getPlantCount());
        System.out.println(notebook.getAnimalCount());
//        System.out.println(notebook.getCarnivores());
//        System.out.println(notebook.getHerbivores());
//        System.out.println(diplodocus);
//        diplodocus.addPlantToDiet(flower);
//        System.out.println(diplodocus);
//        System.out.println(notebook.getOmnivores());

        notebook.sortAnimalsByName();
        notebook.sortPlantsByName();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        notebook.printNotebook();

        notebook.sortAnimalsByHeight();
        notebook.sortPlantsByHeight();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        notebook.printNotebook();

    }
}
