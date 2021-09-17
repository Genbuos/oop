package payprogram;

public class laughingToTheBank {
    public static void main(String[] args) {
        Employee employee1 = new Employee("carl",22,40);
        System.out.println(employee1.calcPaycheck());
        System.out.println(employee1);

        Employee employee2 = new Employee("quavo", 30, 40);
        System.out.println(employee2.calcPaycheck());
        System.out.println(employee2);
    }
}
