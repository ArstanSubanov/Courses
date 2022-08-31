package simpleTasks;

import java.util.Scanner;
public class Task7 {
    //Покупка телефона
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите стоимость телефона:");
        double price = scan.nextDouble();
        System.out.print("Введите кол-во имеющихся у вас денег:");
        double money = scan.nextDouble();

        System.out.println(money-price>=10);

    }
}
