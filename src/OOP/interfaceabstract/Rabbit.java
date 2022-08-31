package OOP.interfaceabstract;

public class Rabbit extends Animal implements Herbivores{
    @Override
    public void eat(){
        System.out.println("Кролик ест траву");
    }

    @Override
    public void move(){
        System.out.println("Кролик передвигается на 4 лапах");
    }

    @Override
    public void reproduce(){
        System.out.println("Кролик размножается как кролик");
    }

    @Override
    public void defense(){
        System.out.println("Кролик защищает нору от хищников");
    }
    @Override
    public void migration(){
        System.out.println("Кролик создает новую нору");
    }
    @Override
    public void beware(){
        System.out.println("Кролик следит нет ли рядом хищников");
    }
}
