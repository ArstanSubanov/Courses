package simpleTasks;

import java.util.Scanner;

public class Task5 {
   // Формула Харрисона-Бенедикта расчет калорийности

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ваш вес, рост, возраст:");
        double weight = scan.nextDouble();
        double height = scan.nextDouble();
        double age = scan.nextDouble();
        System.out.print("Введите коэффициент вашей физической активности:\n" +
                "1,2 – минимальный (сидячая работа, отсутствие физических нагрузок);\n" +
                "1,375 – низкий (тренировки не менее 20 мин 1-3 раза в неделю);\n" +
                "1,55 – умеренный (тренировки 30-60 мин 3-4 раза в неделю);\n" +
                "1,7 – высокий (тренировки 30-60 мин 5-7 раза в неделю; тяжелая физическая работа);\n" +
                "1,9 – экстремальный (несколько интенсивных тренировок в день 6-7 раз в неделю; очень трудоемкая работа):");
        double physicalActivity = scan.nextDouble();


        double forWomen = 655.1 + (9.563 * weight) + (1.85 * height) - (4.676 * age);
        double forMen = 66.5 + (13.75 * weight) + (5.003 * height) - (6.775 * age);

        System.out.println("Для женщин:"+ forWomen * physicalActivity);
        System.out.println("Для мужчин:"+ forMen * physicalActivity);
    }
}
