package simpleTasks;

public class Task14 {
    //Задача на FOR
    public static void main(String[] args) {
        for (int i = 0; i<10; i++){
            System.out.println("Арстан");
        }
        System.out.println();
        for (int i = 1; i<=100; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i<=100; i++){
            if (i%2 == 0) System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i<=100; i++){
            if (i%4 == 0) System.out.print(i + " ");
        }

    }
}
