package simpleTasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите оклад:");
        double salary = scan.nextDouble();
        System.out.print("Введите кол-во календарных дней:");
        int allDays = scan.nextInt();
        System.out.print("Введите кол-во рабочих дней:");
        int workDays = scan.nextInt();
        System.out.print("Введите премию:");
        double premium = scan.nextDouble();
        System.out.print("Введите удержания:");
        double retention = scan.nextDouble();

        final int tax = 13;
        double result = getSalary(salary, allDays, workDays, premium, tax, retention);
        System.out.println(result);
    }

    public static double getSalary(double salary, int allDays, int workDays, double premium, int tax, double retention){

        return salary/allDays*workDays+premium-(salary/100*tax)-retention;
    }
}
