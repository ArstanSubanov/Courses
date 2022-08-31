package simpleTasks;

import java.util.Scanner;

public class Task11 {
//Калькулятор
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);

          System.out.print("Введите выражение: ");
          double a = scan.nextDouble();
          char c = scan.next().charAt(0);
          double b = scan.nextDouble();

          do {
              switch (c){
                  case '+':
                      a += b;
                      break;
                  case '-':
                      a -= b;
                      break;
                  case '*':
                      a *= b;
                      break;
                  case '/':
                      a /= b;
                      break;
                  case '%':
                      a %= b;
                      break;
                  default: System.out.println("Не опознана операция!");
              }
              System.out.print("Введите выражение: "+ a + " ");
              c = scan.next().charAt(0);
              if (c != '=') b = scan.nextDouble();

          }while (c != '=');
          System.out.println("Ответ: "+ a);
          scan.close();

      }

}
