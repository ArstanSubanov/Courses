package OOP.interfaceabstract;

public class Rat extends Animal implements Herbivores, Predator{
    @Override
    public void eat(){
        System.out.println("Крыса ест как растительню пищу так и мясо животных");
    }

    @Override
    public void move(){
        System.out.println("Крыса бежит на 4 лапах");
    }

    @Override
    public void reproduce(){
        System.out.println("Крыса размножается");
    }

    @Override
    public void search(){
        System.out.println("Крыса ищет себе добычу");
    }

    @Override
    public void attack() {
        System.out.println("Крыса атакует свою жертву");
    }

    @Override
    public void territory(){
        System.out.println("Крыса потрулирует свою территорию");
    }

    @Override
    public void defense(){
        System.out.println("Загнанная в угол крыса ни о чем не говорит?");
    }
    @Override
    public void migration(){
        System.out.println("Крыса переехала в новое убежище");
    }
    @Override
    public void beware(){
        System.out.println("Крыса следит нет ли рядом хищников");
    }


}
