package reflection;

/**
 * Created by teodor.miu on 08-Feb-17.
 */
public class Employee {
    String name;
    double salary;
    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
