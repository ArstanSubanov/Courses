package simpleTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Task13 {
    //Перевести байты в килобайты или наоборот

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("из: ");
        String from = scan.nextLine();
        System.out.print("в: ");
        String to = scan.nextLine();
        System.out.print("значение: ");
        double result = scan.nextDouble();

        Map<String, Integer> memory = new HashMap<String, Integer>();

        memory.put("b", 1);
        memory.put("kb", 2);
        memory.put("mb", 3);
        memory.put("gb", 4);

        if (memory.get(from)-memory.get(to)>0){
            System.out.println("ответ: "+ result * Math.pow(1024, Math.abs(memory.get(from)-memory.get(to))));
        }else {
            System.out.println("ответ: "+ result * Math.pow(1024, 1.0/(memory.get(from)-memory.get(to))));
        }

    }
}
