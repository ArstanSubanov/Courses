package simpleTasks;

import java.util.Scanner;

public class Task4 {
    //Формула красоты от Ландау
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите параметры бюст/бедра/талия/рост/вес:");
        double k = scan.nextDouble();
        double m = scan.nextDouble();
        double n = scan.nextDouble();
        double t = scan.nextDouble();
        double p = scan.nextDouble();

        double result = (k*m*t)/((n*n)*p);
        System.out.println(result);
    }

}
