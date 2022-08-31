package OOP.inheritances;

import java.security.PublicKey;

public class Developer extends Employee{
    private String grades;

    public Developer(String name, int age, double salary, String grades){
        super(name, age, salary);
        this.grades = grades;
    }
    public Developer(){
    }

    public void setGrades(String grades){
        this.grades = grades;
    }
    public String getGrades(){
        return grades;
    }

    public String toString(){
        Employee employee = new Employee(getName(), getAge(), getSalary());
        return employee.toString()+"\n"+"Ранги: "+grades;
    }

    public void writeCode(){
        System.out.println(getName()+" пишет код");
    }
}
