package simpleTasks;

public class Task2 {
    //Создать и распечатать 45 переменных на 5 различных тем (по 9 переменных на каждую тему)
    public static void main(String[] args) {
        //Переменные на тему любовь
        String synonym = "единство";
        String synonym1 = "увлечение";
        String synonym2 = "чувство";
        String synonym3 = "союз";
        String synonym4 = "желание";
        String synonym5 = "страсть";
        String synonym6 = "интерес";
        String synonym7 = "дружба";
        String synonym8 = "порыв";
        System.out.println("Любовь: "+synonym+" "+synonym1+" "+synonym2+" "+synonym3+" "+synonym4+" "+synonym5+" "+synonym6+" "+synonym7+" "+synonym8);
        System.out.println();

        //Переменные на тему религии
        String religionName = "Ислам";
        String createdPlace = "Хиджаз";
        int createdYear = 610;
        String founder = "Мухаммед";
        String scripture = "Коран";
        String creed = "Монотеизм";
        float followers = 1.8f;
        String mainTemple = "Мечеть аль-Харам";
        int countries = 28;
        System.out.printf("Религия: %s;\n Место создания: %s;\n Год создания: %d;\n Основтель: %s;\n Писание: %s;\n " +
                "Вероубеждение: %s;\n Кол-во верующих: %.1f млрд;\n Главный храм: %s;\n Кол-во стран с гос.религией: %d\n", religionName,
                createdPlace, createdYear, founder, scripture, creed, followers, mainTemple, countries);
        System.out.println();

        //Переменные на тему космос
        String planetName = "Юпитер";
        String planetType = "Газовый гигант";
        double radius = 69911;
        double weight = 1.8982*10e27;
        double distance = 778;
        double temperature = -145;
        double planetAge = 4.603;
        double yearTurnover = 11.8618;
        float dayCircle = 595.33f;
        System.out.printf("Космос: Наименование планеты: %s\n " +
                "Тип: %s\n Радиус: %f\n Масса: %f\n Среднее расстояние до Земли: %f\n " +
                "Температура поверхности: %.2f C\n Возраст: %f млрд лет\n Год: %f земных лет\n" +
                "Солнечные сутки: %.2f мин\n", planetName, planetType, radius, weight, distance, temperature, planetAge, yearTurnover, dayCircle);
        System.out.println();

        //Переменные на тему автомобили
        String mark = "BMW X5";
        String fabricator = "BMW";
        String color = "серебристый";
        int year = 2005;
        float engine = 4.4f;
        String carcase = "внедорожник";
        String transmission = "автомат";
        String gear = "полный";
        double price = 7300;
        System.out.printf("Марка: %s\n Изготовитель: %s\n Цвет: %s\n Год выпуска: %d\n Двигатель: %.1f\n Кузов: %s\n Коробка: %s\n Привод: %s\n Цена: %.1f $\n",
                mark, fabricator, color, year, engine, carcase, transmission, gear, price);
        System.out.println();

        //Переменные на тему природа
        String naturalName = "Клубника";
        float calories = 33;
        float fats = 0.3f;
        float cholesterol = 0;
        float sodium = 1;
        float potassium = 153;
        float carbohydrates = 8;
        float sugar = 4.9f;
        float proteins = 0.7f;
        System.out.printf("Пищевая ценность: %s\n Калории: %f\n Жиры: %f\n Холестерин: %f\n Натрий: %f\n Калий: %f\n Углеводы: %f\n Сахар: %f\n Белки: %f\n",
                naturalName,calories, fats, cholesterol, sodium, potassium, carbohydrates, sugar, proteins);




    }
}
