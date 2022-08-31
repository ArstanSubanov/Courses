package OOP.enums;

public enum Element {
    H(1, "Водород", 1.00794),
    He(2,"Гелий", 4.002602),
    Li(3, "Литий", 6.9412),
    Be(4, "Бериллий", 9.0122),
    B(5, "Бор", 10.812),
    С(6, "Углерод", 12.011),
    N(7, "Азот", 14.0067),
    О(8, "Кислород",15.9994),
    F(9, "Фтор", 1.9984),
    Ne(10, "Неон", 20.179);
    // и т.д.
    //1 H Водород (а.м. 1,00794)
    //2 He Гелий (а.м. 4,002602)
    //3 Li Литий (а.м. 6,9412)
    //4 Be Бериллий (а.м. 9,0122)
    //5 B Бор (а.м. 10,812)
    //6 С Углерод (а.м. 12,011)
    //7 N Азот (а.м. 14,0067)
    //8 О Кислород (а.м. 15,9994)
    //9 F Фтор (а.м. 18,9984)
    //10 Ne Неон (а.м. 20,179)

    private int number;
    private String name;
    private double weight;
    Element(int number, String name, double weight){
        this.number = number;
        this.name = name;
        this.weight = weight;
    }

    public int getNumber(){
        return number;
    }

    public String getName(){
        return name;
    }

    public double getWeight(){
        return weight;
    }

    public String toString(){
        return "Химический элемент: "+ this.name() +"\n"+
                "Название элемента: "+ name +"\n"+
                "Порядковый номер: "+ number +"\n"+
                "Атомная масса: "+ weight +"\n";
    }
}
