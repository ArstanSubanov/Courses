package OOP.interfaceabstract;

public class Zebra extends Animal implements Herbivores{
    @Override
    public void eat(){
        System.out.println("Зебра ест траву");
    }

    @Override
    public void move(){
        System.out.println("Зебра передвигается на 4 копытах");
    }

    @Override
    public void reproduce(){
        System.out.println("Зебра размножается");
    }

    @Override
    public void defense(){
        System.out.println("Зебра защищается от хищников");
    }
    @Override
    public void migration(){
        System.out.println("Зебра мигрирует со своим стадом");
    }
    @Override
    public void beware(){
        System.out.println("Зебра следит нет ли рядом хищников");
    }

}
