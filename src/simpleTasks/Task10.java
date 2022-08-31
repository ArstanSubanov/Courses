package simpleTasks;

import java.util.Scanner;
import java.util.Random;
public class Task10 {
    //Тест на умножение чисел
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int a = rand.nextInt(8)+2;
        int b = rand.nextInt(8)+2;

        System.out.println("1-е число:"+a);
        System.out.println("2-е число:"+b);
        System.out.print("Введите результат умножения этих чисел:");

        int userResult = scan.nextInt();
        boolean isTrue = a * b == userResult;
        System.out.println("Результат:"+isTrue);

    }
}
