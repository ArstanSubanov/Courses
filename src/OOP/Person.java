package OOP;

import sun.security.util.ArrayUtil;

import java.util.Arrays;

public class Person {
  /**  Каждый ввод проверять, если данные не введены или ввел некорректные данные
    то спрашивать пока не введет корректные данные (рекурсия)

    Вопрос женат/замужем ответ будет да или нет и
    в зависимости от ответа присвоить true||false

    Через сканнер заполнить инфо о человеке
    String name;
    int age;
    double weight;
    boolean married;
    String[] activities;
    String phoneNumber;
    float height;
    Распечатать инфо о человеке**/
  private String name;
  private int age;
  private double weight;
  private boolean married;
  private String[] activities;
  private String phoneNumber;
  private float height;

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void setMarried(boolean married) {
    this.married = married;
  }

  public void setActivities(String[] activities) {
    this.activities = activities;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void setHeight(float height) {
    this.height = height;
  }

  public String toString(){
    StringBuilder sb = new StringBuilder();
    if (name!=null)sb.append("Имя: ").append(name).append("\n");
    if (age!=0)sb.append("Возраст: ").append(String.valueOf(age)).append("\n");
    if (weight!=0)sb.append("Вес: ").append(String.valueOf(weight)).append("\n");
    if (height!=0)sb.append("Рост: ").append(String.valueOf(height)).append("\n");
    String isMarried;
    if (married) isMarried = "Да"; else isMarried = "Нет";
    sb.append("Женат/Замужем: ").append(isMarried).append("\n");
    if (phoneNumber!=null)sb.append("Номер телефона: ").append(phoneNumber).append("\n");
    try {
      sb.append("Активности: ").append(Arrays.toString(activities));
    }catch (Exception e){ System.out.println("Массив не инициализирован");}
    if (sb.length()==0)sb.append("Данные объекта не заданы");

    return String.valueOf(sb);
  }
}
