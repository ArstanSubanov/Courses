package simpleTasks;

import java.util.Scanner;
public class Task16 {
    //Котлеты
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите k, m, n: ");
        int k = scan.nextInt();
        double m = scan.nextDouble();
        int n = scan.nextInt();
        double result = 0;

        do {
            result += m*2;
            n -= k;

        }while (n>0);

        System.out.println(result + " минут");

        scan.close();
    }
}
