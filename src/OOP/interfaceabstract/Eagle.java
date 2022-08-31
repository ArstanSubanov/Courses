package OOP.interfaceabstract;

public class Eagle extends Animal implements Predator{
    @Override
    public void eat(){
        System.out.println("Орел ест мясо животного");
    }

    @Override
    public void move(){
        System.out.println("Орел расправляет крылья и летает");
    }

    @Override
    public void reproduce(){
        System.out.println("Орел откладывает яйца");
    }

    @Override
    public void search(){
        System.out.println("Орел выслеживает добычу");
    }

    @Override
    public void attack() {
        System.out.println("Орел пикирует и хватает добычу");
    }

    @Override
    public void territory(){
        System.out.println("Орел потрулирует свою территорию");
    }
}
