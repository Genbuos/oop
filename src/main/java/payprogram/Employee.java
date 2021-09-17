package payprogram;

public class Employee {
    public String name;
    public int wageperHour;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", wageperHour=" + wageperHour +
                ", hoursworked=" + hoursworked +
                '}';
    }

    public int hoursworked;


    public Employee(String name, int wageperHour, int hoursworked){
        this.name = name;
        this.wageperHour = wageperHour;
        this.hoursworked = hoursworked;

    }
    public double calcPaycheck(){
        return wageperHour * hoursworked;
    }

}
