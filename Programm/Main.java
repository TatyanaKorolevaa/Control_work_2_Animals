package Programm;

import java.security.InvalidAlgorithmParameterException;
import java.util.Scanner;

import Programm.PackedAnimals.Horse;
import Programm.PackedAnimals.Camel;
import Programm.PackedAnimals.Donkey;

import Programm.HomeAnimals.Cat;
import Programm.HomeAnimals.Dog;
import Programm.HomeAnimals.Hamster;

public class Main {
    public static void main(String[] args) {

        Farm<Animal> animalFarm = new Farm<>();

        animalFarm.adopt(new Cat(101, "Myrka", "2023-06-12", true));
        animalFarm.adopt(new Donkey(117, "Grey", "2021-12-31", 12));
        animalFarm.adopt(new Camel(113, "Esya", "2020-08-07", 15));
        animalFarm.adopt(new Horse(110, "Sky" , "2019-10-08", 10));
        animalFarm.adopt(new Dog(104, "Rich", "2019-03-01", false));
        animalFarm.adopt(new Hamster(107, "Homa", "2022-09-08", false));
        

        try {
            while (true) {

                Menu.showMainMenu();
                try (
                        Scanner sc = new Scanner(System.in)) {
                    int i = sc.nextInt();
                    switch (i) {
                        case 1:
                            Farm.printAnimals();
                            break;
                        case 2:
                            Menu.printOnlyThisClass(animalFarm);
                            break;
                        case 3:
                            Menu.Comands();
                            break;
                        case 4:
                            Menu.newComand();
                            break;
                        case 5:
                            Menu.newAnimal();
                            break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Try one more time");
        }
    }
    
}
