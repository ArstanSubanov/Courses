package OOP;

import java.util.Arrays;
import java.util.Random;

/**
 * Программа должна содержать 2 класса Main и Guitar. Класс Guitar должен иметь поля color (цвет гитары), stringCount (количество струн, по умолчанию 6), tensions (массив из 6 int, обозначающих уровень натяжения от 1 до 10). В классе Guitar нужно создать все геттеры и сеттеры (сеттер для поля tensions создавать не нужно). Также в классе Guitar необходимо реализовать:
 * 1) метод tune (настройка гитары), которая выставляет все значения массива tensions равным 5
 * 2) метод play (игра на гитаре), которая распечатывает 4 строки из вашей любимой песни и вызывает приватный метод unsettle
 * 3) приватный метод unsettle (гитара расстроилась), который должен изменить все значения полей массива tensions на случайное значение в пределах от 0 до 3.
 */
public class Guitar {
    private String color;
    private int stringCount = 6;
    int[] tensions;

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setStringCount(int stringCount){
        this.stringCount = stringCount;
    }

    public int getStringCount(){ return stringCount;}

    public String getTensions(){
        return Arrays.toString(tensions);
    }

    public void tune(){
        tensions = new int[stringCount];
        Arrays.fill(tensions, 5);
    }

    public void play(){
        System.out.println("Oh, the misery\n" +
                "Everybody wants to be my enemy\n" +
                "Spare the sympathy\n" +
                "Everybody wants to be my enemy");
        unsettle();

    }

    private void unsettle(){
        Random random = new Random();
        for (int i=0; i< tensions.length; i++){
            tensions[i] = random.nextInt(4);
        }
    }

}
