package OOP.interfaceabstract;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать
 *
 * абстрактный   класс Animal с абстрактным методом и обычным методом, несколько классов наследников минимум 4.
 * Должно быть реализовано  иерархическое наследование.
 * Несколько интерфейсов.
 * Создайте в main классе по два вида каждого класса животных
 * В классе main вывести все свойства и методы всех классов
 * работаем с массивами для вывода. Проявить фантазию и использовать все что поняли относительно классов, абстрактных классов и интерфейсов.
 */

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Eagle());
        animals.add(new Ape());
        animals.add(new Lion());
        animals.add(new Orlan());
        animals.add(new Rabbit());
        animals.add(new Rat());
        animals.add(new Zebra());

        for (Animal animal:animals){
            animal.breathe();
            animal.eat();
            animal.move();
            animal.reproduce();
            if (animal instanceof Predator){
                Predator predator = (Predator) animal;
                predator.attack();
                predator.search();
                predator.territory();
            }

            if (animal instanceof Herbivores){
                Herbivores herbivores = (Herbivores) animal;
                herbivores.beware();
                herbivores.defense();
                herbivores.migration();
            }

            System.out.println();

        }

    }
}
