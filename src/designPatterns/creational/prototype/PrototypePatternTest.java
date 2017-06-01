package designPatterns.creational.prototype;


import reflection.Employee;

/**
 * Created by Asus x556 on 01-Jun-17.
 */
public class PrototypePatternTest {
    public static void main(String[]args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadData();

        Employees employees1 = (Employees)employees.clone();
        Employees employees2 = (Employees)employees.clone();

        employees1.getEmpList().remove(1);
        employees2.getEmpList().add("Teo");
        System.out.println(employees.getEmpList());
        System.out.println(employees1.getEmpList());
        System.out.println(employees2.getEmpList());
    }
}
