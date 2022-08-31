package OOP.interfaceabstract;

public abstract class Animal {

    public void breathe(){
        System.out.println("This animal breathes");
    }

    public abstract void eat();

    public abstract void move();

    public abstract void reproduce();
}
