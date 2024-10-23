package Programm.HomeAnimals;

public class Cat extends HomeAnimal{
    boolean houseLiver;

    public Cat(int id, String name, String birthdate, boolean thoroughbred) {
        super(id, name, birthdate, thoroughbred);

    }

    public void Comands(){
        System.out.println("Выполняемые команды животного");
    }
}
