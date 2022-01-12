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
        ForestNotebook notebook = new ForestNotebook();
        Set<Plant> plantDiet = new LinkedHashSet<>();

        Bush bush = new Bush("Blue bush", 0.78);
        Bush abush = new Bush("Dead bush", 0.02);
        Flower flower = new Flower("lili of the valley", 0.33);
        Tree tree = new Tree("Tall tree", 356);
        Weed weed = new Weed("G13", 9);
        Weed middleWeed = new Weed("Gorilla glue", 1.02);
        tree.setLeafType(LeafType.HEART);
        flower.setSmell(Scent.MUSKEY);
        bush.setFruit("Glowing bluberries");
        bush.setLeaftype(LeafType.ROUND);
        abush.setFruit("Golden nuggets");
        weed.setArea(4.99);
        middleWeed.setArea(99.01);

        plantDiet.add(middleWeed);
        plantDiet.add(weed);

        Carnivore blue = new Carnivore("Blue from jurassic world", 2, 9.6, 6);
        Carnivore trex = new Carnivore("Tyrannosaurus", 8, 6, 1.2);
        Carnivore giganotosaurus = new Carnivore("Giganotosaurus", 8999, 55665.6, 2);
        Herbivore diplodocus = new Herbivore("Diplodocus", 223, 5.5, 698);
        Herbivore theropods = new Herbivore("Theropods", 236, 4.7, 5);
        Herbivore giraffatitan = new Herbivore("Giraffatitan", 98, 41, 2);
        Omnivore khaan = new Omnivore("Khaan", 12, 0, 213);
        Omnivore avimimus = new Omnivore("Avimimus", 89, 4, 4);
        Omnivore nomingia = new Omnivore("Nomingia", 56, 122, 14);
        blue.setMaxFoodSize(89);
        diplodocus.setPlantDiet(plantDiet);
        theropods.setPlantDiet(plantDiet);
        giraffatitan.setPlantDiet(plantDiet);
        khaan.setPlantDiet(plantDiet);
        nomingia.setPlantDiet(plantDiet);


        notebook.addPlant(bush);
        notebook.addPlant(bush);
        notebook.addPlant(abush);
        notebook.addPlant(flower);
        notebook.addPlant(tree);
        notebook.addPlant(weed);
        notebook.addPlant(middleWeed);
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



        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        notebook.printNotebook();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        avimimus.addPlantToDiet(bush);
        notebook.getCarnivores().forEach(System.out::println);
        notebook.getOmnivores().forEach(System.out::println);
        notebook.getHerbivores().forEach(System.out::println);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        notebook.sortPlantsByName();
        notebook.sortAnimalsByName();
        notebook.printNotebook();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        notebook.sortPlantsByHeight();
        notebook.sortAnimalsByHeight();
        notebook.printNotebook();

        System.out.println(" ");

        System.out.println("Plant count: " + notebook.getPlantCount());
        System.out.println("Animal count: " + notebook.getAnimalCount());
    }
}
