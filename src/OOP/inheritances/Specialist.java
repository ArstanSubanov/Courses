package OOP.inheritances;

public class Specialist extends Employee{
    private int levels;

    public Specialist(String name, int age, double salary, int levels){
        super(name, age, salary);
        this.levels = levels;
    }
    public Specialist(){
        super();
    }

    public void setLevels(int levels){
        this.levels = levels;
    }

    public int getLevels(){
        return levels;
    }

    public String toString(){
        Employee employee = new Employee(getName(), getAge(), getSalary());
        return employee.toString()+"\n"+"Уровень: "+levels;
    }

    public void workWithClients(){
        System.out.println(getName()+" работает с клиентами");
    }





}
