package OOP;

/**
 * Создать класс студентов:
 * имя
 * фамилия
 * название курса
 * оплатил
 * возраст
 *
 * Создать массив из 5 студентов и добавить объекты класса студент.
 *
 * Написать метод который выводит всех студентов в системе и всю информацию
 *
 * Распечатать имена студентов возраст которых между 18-23
 *
 * распечатать имена студентов которые оплатили курсы
 */
public class Student {
    String name;
    String surname;
    String courses;
    boolean isPaid;
    int age;

    public Student(String name, String surname, String courses, boolean isPaid, int age){
        this.name = name;
        this.surname = surname;
        this.courses = courses;
        this.isPaid = isPaid;
        this.age = age;
    }

    public String toString(){
        String pay;
        if (isPaid) pay = "Да"; else pay = "Нет";
        return "ФИО студента: "+surname+" "+name+"\n"+"Название курса: "+courses+"\n"+"Оплатил курсы: "+pay+"\n"+"Возраст: "+age;
    }
}
