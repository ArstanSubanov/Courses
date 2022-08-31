package simpleTasks;

import java.util.Objects;
import java.util.Scanner;
public class Task17 {
    //Авторизация
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String trueLogin = "arstan";
        String truePassword = "qwerty";
        boolean isBlocked = true;

        for (int i = 1; i<=3; i++){
            System.out.print("Логин: ");
            String login = scan.nextLine();
            System.out.print("Пароль: ");
            String password = scan.nextLine();

            if (login.equals(trueLogin) && password.equals(truePassword)){
                System.out.println("Авторизация прошла успешно");
                isBlocked = false;
                break;
            }else System.out.println("Логин или пароль неверны");
        }
        if (isBlocked) System.out.println("Вы заблокированы!");
    }
}
