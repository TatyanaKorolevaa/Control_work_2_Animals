package Programm.HomeAnimals;

public class Hamster extends HomeAnimal{
    String cage; 

    public Hamster(int id, String name, String birthdate, boolean thoroughbred) {
        super(id, name, birthdate, thoroughbred);
    }

    public void Comands(){
        System.out.println("Это животное не выполняет команд");
    }
    
}
