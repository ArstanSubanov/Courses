package simpleTasks;

import java.util.Scanner;

public class Task9 {
    //Деление

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 2 числа:");
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        boolean wholeNumber = a%b==0;

        System.out.println("Целое число:"+wholeNumber);


    }
}
