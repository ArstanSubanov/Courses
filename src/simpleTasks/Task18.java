package simpleTasks;

import java.util.Scanner;
//Массивы

public class Task18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arraySize = scan.nextInt();
        int element = 0;
        int[] array = new int[arraySize];

        System.out.print("Введите элементы массива через пробел: ");
        for (int i = 0; i<=arraySize-1; i++){
            element = scan.nextInt();
            array[i] = element;
        }

        ArrayOperations myArray = new ArrayOperations(array);

        for (int i:array){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("Максимальное значение в массиве: "+ myArray.getMax());
        System.out.println("Минимальное значение в массиве: "+ myArray.getMin());
        System.out.println("Сред. Ариф всех элементов: "+ myArray.getAverage());
        System.out.println("Сумму всех значений: "+ myArray.getSum());
        System.out.println("Сумму всех четных: "+ myArray.getEven());
        System.out.println("Сумму всех не четных: "+ myArray.getOdd());

    }
}

class ArrayOperations{
    int[] array;
    public ArrayOperations(int[] array){
        this.array = array;
    }

    int getMax(){
        int max = array[0];
        for(int i:array){
            if (i>max) max = i;
        }
        return max;
    }

    int getMin(){
        int min = array[0];
        for (int i:array){
            if (i<min) min = i;
        }
        return min;
    }

    int getSum(){
        int total = 0;
        for (int i:array){
            total += i;
        }
        return total;
    }

    double getAverage(){
        double average = (double) getSum();
        return average/array.length;
    }

    int getEven(){
        int total = 0;
        for (int i:array){
            if (i%2==0) total += i;
        }
        return total;
    }

    int getOdd(){
        int total = 0;
        for (int i:array){
            if (i%2!=0) total += i;
        }
        return total;
    }

}