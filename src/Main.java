import OOP.Person;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);

        checkCorrectInput("Введите имя: ", person, 1, scanner);
        checkCorrectInput("Введите возраст: ", person, 2, scanner);
        checkCorrectInput("Введите вес: ", person, 3, scanner);
        checkCorrectInput("женат/замужем да/нет: ", person, 4, scanner);
        checkCorrectInput("Введите номер телефона: ", person, 5, scanner);
        checkCorrectInput("Введите рост: ", person, 6, scanner);
        checkCorrectInput("Введите активности через пробел: ", person, 7, scanner);
        System.out.println(person);
        scanner.close();
    }

    public static void checkCorrectInput(String textToShow, Person person, int infoType, Scanner scanner){
        System.out.println(textToShow);
        String inputText;
        if (infoType == 1) {
            String name = scanner.nextLine();
            if (isEmptyText(name) && !isNumber(name)) {
                person.setName(name);
            } else checkAgain(textToShow, person, 1, scanner);
        }
        else if (infoType == 2){
                inputText = scanner.nextLine();
                if (isEmptyText(inputText) && isNumber(inputText)){
                    int age = Integer.parseInt(inputText);
                    if (age>0 && age<150) {
                        person.setAge(age);
                    }else checkAgain(textToShow, person, 2, scanner);
                } else checkAgain(textToShow, person, 2, scanner);
        }
        else if (infoType == 3) {
            inputText = scanner.nextLine();
            if (isEmptyText(inputText) && isNumber(inputText)) {
                double weight = Double.parseDouble(inputText);
                if (weight > 0 && weight < 500) {
                    person.setWeight(weight);
                } else checkAgain(textToShow, person, 3, scanner);
            } else checkAgain(textToShow, person, 3, scanner);
        }
        else if (infoType == 4) {
            inputText = scanner.nextLine();
            if (isEmptyText(inputText) && (inputText.equals("да") || inputText.equals("нет"))) {
                if (inputText.equals("да")) person.setMarried(true);
            } else checkAgain(textToShow, person, 4, scanner);
        }
        else if (infoType == 5) {
            inputText = scanner.nextLine();
            if (isEmptyText(inputText)) {
                person.setPhoneNumber(inputText);
            } else checkAgain(textToShow, person, 5, scanner);
        }
        else if (infoType == 6) {
            inputText = scanner.nextLine();
            if (isEmptyText(inputText) && isNumber(inputText)) {
                float height = Float.parseFloat(inputText);
                if (height > 10 && height < 300) {
                    person.setHeight(height);
                } else checkAgain(textToShow, person, 6, scanner);
            } else checkAgain(textToShow, person, 6, scanner);
        }
        else if (infoType == 7) {
                inputText = scanner.nextLine();
                if (isEmptyText(inputText)){
                    String[] array = inputText.split(" ");
                    if (!isArrayCorrect(array)){
                        person.setActivities(array);
                    } else checkAgain(textToShow, person, 7, scanner);
                }else checkAgain(textToShow, person, 7, scanner);
        } else System.out.println("Неправильный вызов метода");
    }

    public static boolean isNumber(String text){
        if (text == null) return false;
        try {
            double check = Double.parseDouble(text);
            return true;
        }catch (NumberFormatException e) {return false;}

    }

    public static boolean isEmptyText(String text){
        return !text.isEmpty() && !text.equals(" ");
    }

    public static void checkAgain(String textToShow, Person person, int infoType, Scanner scanner){
        System.out.println("Неправильно введены данные");
        checkCorrectInput(textToShow, person, infoType, scanner);
    }
    public static boolean isArrayCorrect( String[] array){
        boolean chek = false;
        for (String string:array){
            if (isNumber(string)) {chek = true; break;}
        }
        return chek;
    }

}