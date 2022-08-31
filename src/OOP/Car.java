package OOP;

import java.security.acl.Owner;
import java.util.Objects;
import java.util.Scanner;

/**
 * Класс Car создать геттеры, сеттеры
 * методы:
 * завести двигатель,
 * заглушить двигатель,
 * стоп,
 * газ(скорость)
 *
 * я еду с такой-та скоростью
 *
 *  у класса car создать метод info и этот метод выводит информацию о машине
 */

public class Car {
    private String mark;
    private int year;
    private String owner;
    private int speed;
    private boolean engine;

    public void setMark(String mark){
        this.mark = mark;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getMark(){ return mark;}
    public int getYear(){return year;}
    public String getOwner(){return owner;}
    public int getSpeed(){
        return speed;
    }

    public void turnOn(){
        engine = true;
        System.out.println("Двигатель включен");
    }

    public void turnOff(){
        engine = false;
        System.out.println("Двигатель выключен");
    }

    public void drive(int speed){
        setSpeed(speed);
        if (engine)
            System.out.println("Машина едет со скоростью "+speed+" км/ч");
        else System.out.println("Выключен двигатель, машина не может ехать");
    }

    public void stop(){
        System.out.println("Машина остановилась");
        setSpeed(0);
    }

    public String toString(){
        return "Марка машины: "+mark+"\n"+"Год выпуска: "+year+"\n"+"Владелец машины: "+owner+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && speed == car.speed && engine == car.engine && Objects.equals(mark, car.mark) && Objects.equals(owner, car.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, year, owner, speed, engine);
    }
}
