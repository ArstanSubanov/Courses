package OOP.inheritances;

public class CEO extends Manager{
    private boolean hasCompanyCar;

    public CEO(){
    }
    public CEO(String name, int age, double salary, boolean hasStocks, boolean hasCompanyCar){
        super(name, age, salary, hasStocks);
        this.hasCompanyCar = hasCompanyCar;
    }

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }
    public String toString(){
        Manager manager = new Manager(getName(), getAge(), getSalary(), isHasStocks());
        return manager.toString()+"\n"+"Служебная машина: "+isHasCompanyCar();
    }

    public void goPublic(){
        System.out.println(getAge()+" работает над IPO");
    }

}
