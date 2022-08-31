package OOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    /**    Guitar guitar = new Guitar();
        guitar.setColor("Жёлтый");
        guitar.setStringCount(7);
        guitar.tune();
        System.out.println(guitar.getColor());
        System.out.println(guitar.getStringCount());
        System.out.println(guitar.getTensions());
        guitar.play();
        System.out.println(guitar.getTensions());**/

   /** Car car = new Car();
    car.setMark("Tesla");
    car.setYear(2022);
    car.setOwner("Arstan");
    car.turnOn();
    car.drive(230);
    car.turnOff();
    car.drive(200);
    car.turnOn();
    car.drive(250);
    car.stop();
        System.out.println(car.getSpeed());
        System.out.println(car);**/

   ArrayList<Student> students = new ArrayList<>();
   students.add(new Student("кевин", "Файги", "Логика в фильмах Марвел", false, 49));
   students.add(new Student("Эмбер", "Хёрд", "Как наложить кучу в постели, чтобы муж не заметил",false, 36));
   students.add(new Student("Клаус", "Санта", "Как работать 1 день в году", true, 1769));
   students.add(new Student("Фродо", "Беггинс", "Путешествие для начинающих", true, 33));
   students.add(new Student("Луффи", "Монки Д.", "Как стать Марти Стью", true, 19) );

   for (Student student:students) {
       System.out.println(student);
       System.out.println();
   }
        System.out.println("=========================================");
   for (Student student: students){
      if (student.age>17 && student.age<24){
         System.out.println(student);
         System.out.println();
      }
   }
        System.out.println("=========================================");
   for (Student student: students){
       if (student.isPaid){
           System.out.println(student);
           System.out.println();
       }
   }

    }
}
