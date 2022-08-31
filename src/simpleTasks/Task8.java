package simpleTasks;

import java.util.Scanner;
public class Task8 {
    //Среднее арифметическое

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 4 числа:");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = scan.nextDouble();

        double result = (a+b+c+d)/4;
        boolean wholeNumber = result%2==0;

        System.out.println("Среднее арифметическое:"+result);
        System.out.println("Целое число:"+wholeNumber);


    }
}
