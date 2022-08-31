package OOP.interfaceabstract;

public class Lion extends Animal implements Predator {
    @Override
    public void eat(){
        System.out.println("Лев ест мясо животного");
    }

    @Override
    public void move(){
        System.out.println("Лев бежит на 4 лапах");
    }

    @Override
    public void reproduce(){
        System.out.println("Лев спарививается со львицей");
    }

    @Override
    public void search(){
        System.out.println("Лев ищет себе добычу");
    }

    @Override
    public void attack() {
        System.out.println("Лев атакует свою жертву");
    }

    @Override
    public void territory(){
        System.out.println("Лев потрулирует свою территорию");
    }

}
