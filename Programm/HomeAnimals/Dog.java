package Programm.HomeAnimals;

public class Dog extends HomeAnimal{

    static boolean guard;
    boolean streetBooth;

    public Dog(int id, String name, String birthdate, boolean thoroughbred) {
        super(id, name, birthdate, thoroughbred);
        
    }
    
    public void Comands(){
        System.out.println("Выполняемые команды животного");
    }
}