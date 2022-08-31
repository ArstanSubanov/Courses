package OOP.interfaceabstract;

public class Ape extends Animal implements Predator, Herbivores{
    @Override
    public void eat(){
        System.out.println("Обезьяна ест как растительню пищу так и мясо животных");
    }

    @Override
    public void move(){
        System.out.println("Обезьяна передвигается как на 4 лапах, так и на двух");
    }

    @Override
    public void reproduce(){
        System.out.println("Обезьяна размножается");
    }

    @Override
    public void search(){
        System.out.println("Обезьяна ищет себе добычу");
    }

    @Override
    public void attack() {
        System.out.println("Обезьяна атакует свою жертву");
    }

    @Override
    public void territory(){
        System.out.println("Обезьяна потрулирует свою территорию");
    }

    @Override
    public void defense(){
        System.out.println("Обезьяна защищается от других хищников");
    }
    @Override
    public void migration(){
        System.out.println("Обезьяна мигрирует со своим стадом");
    }
    @Override
    public void beware(){
        System.out.println("Обезьяна следит нет ли рядом хищников");
    }
}
