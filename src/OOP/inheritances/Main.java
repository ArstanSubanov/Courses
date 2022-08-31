package OOP.inheritances;

import java.util.ArrayList;
import java.util.List;

/**
 * Программа должна содержать классы Employee, Specialist, Developer, Manager, CEO, которые должны быть наследованы определенным образом.
 *
 * У каждого сотрудника есть ФИО, возраст и заработная плата. У специалистов есть уровни (int levels), у разработчиков есть ранги (String grades = "Middle"), у менеджеров есть акции (boolean hasStocks), у исполнительного директора есть служебная машина (boolean hasCompanyCar). Исполнительный директор является менеджером!
 *
 * В каждом классе кроме Main должны быть все геттеры и сеттеры, 2 конструктора (пустой и со всеми полями) и метод print() который распечатывает все поля класса.
 *
 * Также необходимо реализовать следующие методы, которые распечатывают соответствующую фразу работника на ваше усмотрение:
 * 1) Специалисты могут работать с клиентами - метод workWithClients();
 * 2) Разработчики пишут код - метод writeCode();
 * 3) Менеджеры разрабатывают процедуры - метод writeProcedures();
 * 4) CEO работает над IPO - метод goPublic();
 *
 * Пример распечатки фразы работника: "I am writing my awesome algorithm!"
 *
 * В классе Main необходимо создать 3-х, специалистов, 4-х разработчиков, 2-х менеджеров и 1-го CEO, распечатать все поля каждого объекта (print) и вызвать уникальные методы каждого объекта.
 */
public class Main {
    public static void main(String[] args) {
        List<Specialist> specialists = new ArrayList<>();
        specialists.add(new Specialist("Ivan Ivanov", 34, 4000, 4));
        specialists.add(new Specialist("Alex Peterson", 39, 10000, 5));
        specialists.add(new Specialist("Steve Rayan", 24, 2500, 2));
        for (Specialist specialist:specialists){
            System.out.println(specialist);
            specialist.workWithClients();
            System.out.println();
        }

        List<Developer> developers = new ArrayList<>();
        developers.add(new Developer("Bill Gates", 67, 4500000, "senior"));
        developers.add(new Developer("Kyle Freedman", 45, 14000, "middle"));
        developers.add(new Developer("Роман кузьмин", 24, 500, "junior"));
        developers.add(new Developer("Mark Kale", 43, 20000, "senior"));

        for (Developer developer: developers){
            System.out.println(developer);
            developer.writeCode();
            System.out.println();
        }

        List<Manager> managers = new ArrayList<>();
        managers.add(new Manager("Chuck Barry", 34, 40000, true));
        managers.add(new Manager("Freya Morris", 25, 20000, false));

        for (Manager manager:managers){
            System.out.println(manager);
            manager.writeProcedures();
            System.out.println();
        }

        CEO ceo = new CEO("Edward Green", 47, 100000, true, true);
        System.out.println(ceo);
        ceo.goPublic();

    }
}
