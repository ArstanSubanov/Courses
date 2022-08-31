package OOP.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>(Arrays.asList(Element.values()));
        elements.forEach(System.out::println);
    }
}
