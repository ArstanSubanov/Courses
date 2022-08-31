package OOP.inheritances;

public class Manager extends Employee{
    private boolean hasStocks;

    public Manager(){
    }
    public Manager(String name, int age, double salary, boolean hasStocks){
        super(name, age, salary);
        this.hasStocks = hasStocks;
    }

    public boolean isHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }
    public String toString(){
        Employee employee = new Employee(getName(), getAge(), getSalary());
        return employee.toString()+"\n"+"Акции: "+hasStocks;
    }

    public void writeProcedures(){
        System.out.println(getName()+ " разрабатывает процедуру");
    }
}
