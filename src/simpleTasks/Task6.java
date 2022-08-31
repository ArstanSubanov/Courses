package simpleTasks;

import java.util.Scanner;
public class Task6 {
    //Формула расчета аннуитетного платежа
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите сумму кредитв:");
        double k = scan.nextDouble();
        System.out.print("Введите процентную ставку:");
        double p = scan.nextDouble();
        System.out.print("Введите кол-во месяцев:");
        double m = scan.nextDouble();

        double a = k*(p/(1+p)-m-1);

        System.out.println(a);

    }
}
