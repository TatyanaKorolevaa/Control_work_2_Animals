package Programm;

import Programm.PackedAnimals.PackedAnimal;
import Programm.HomeAnimals.HomeAnimal;
import java.util.ArrayList;
import java.util.List;


public class Farm<A> {
    private List<A> animals;

    public Farm() {
        animals = new ArrayList();
    }

    public boolean adopt(Animal animal) {
        return animals.add(animal);
    }

    public Farm<Animal> release(Farm<Animal> animalFarm) {
        if (animals.contains(animalFarm)) {
            animals.remove(animalFarm);
            return animalFarm;
        }
        return null;
    }

    public static <A> Farm<A> create() {
        return new Farm<A>();
    }



    public void printOnlyThisClass(int animalClass) {
        switch (animalClass) {
            case 1:
                printCollection(HomeAnimal.class);
                break;
            case 2:
                printCollection(PackedAnimal.class);
                break;
        }
    }

    public void printCollection(Class<?> choiseClass){
        for (A animal :
                animals) {
            if (choiseClass.isInstance(animal)) {
                System.out.println(animal.toString());
            }
        }
    }

    public void printAnimals() {
        for (A animal :
                animals) {
            System.out.println(animal.toString());
        }
    }
}