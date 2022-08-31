package simpleTasks;

import java.util.Scanner;
import java.util.Random;
public class Task12 {
    //Угадать случайное число
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100)+1;
        int a;
        boolean isFind = false;

        for (int i = 1; i<=10; i++){

            System.out.println("Введите ваше число: ");
            a = scan.nextInt();
            if (a == number){
                System.out.println("Вы угадали!");
                isFind = true;
                break;
            }else {
                if (a > number) System.out.println("Ваше число больше загаданного числа!");
                else System.out.println("Ваше число меньше загаданного числа!");
            }
        }
        if (isFind) System.exit(0);
        else System.out.println("Попытки закончились, вы не угадали!");

        scan.close();


    }
}
