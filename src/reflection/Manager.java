package reflection;

/**
 * Created by teodor.miu on 08-Feb-17.
 */
public class Manager extends Employee {
    int bonus;
    public Manager(String name, double salary) {
        super(name, salary);
        bonus=0;
    }
    public double getSalary(){
        return super.getSalary()+bonus;
    }

    public static void main(String[]args){
        Manager[] bosses = new Manager[10];
        Employee[] empls =  bosses;
//        empls[0] = new Employee("Asfas",13);//Runtime error
//        bosses[0] = new Employee("Asfas",13);//Compile error
    }
}
