package designPatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus x556 on 01-Jun-17.
 */
public class Employees implements Cloneable{
    private List<String> empList;
    public Employees(){
        empList = new ArrayList<>();
    }
    public Employees(List<String> list){
        this.empList=list;
    }
    public void loadData(){
        //read all employees from database and put into the list
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> tempEmpList = new ArrayList<>();
        for(String emp:empList){
            tempEmpList.add(emp);
        }
        return new Employees(tempEmpList);
    }


}
