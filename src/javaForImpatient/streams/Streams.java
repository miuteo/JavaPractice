package javaForImpatient.streams;

import reflection.Employee;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by teodor.miu on 21-Feb-17.
 */
public class Streams {
    public static void main(String[]args){
        List<Employee> array = new ArrayList<>();
        array.add(new Employee("Teo",1000));
        array.add(new Employee("Ionela",1200));

        Employee emp =  array.parallelStream().filter(e -> e.getSalary()>1000).findFirst().orElse(null);
        System.out.println(emp.getName());
        emp.setName("Ionela 2");
        System.out.println(array.get(1).getName());
        System.out.println(emp.getName());

        System.out.println();
        System.out.println(emp);
        System.out.println(array.get(1));
        System.out.println(emp.equals(array.get(1)));

//        DateTimeFormatter dateFormat =
//                DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss");
//
//        LocalDateTime date = LocalDateTime.parse("2007-05-04 12:10:09", DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss"));
//        System.out.println(dateFormat.format(date));
//        System.out.println(dateFormat.format(date.plusHours(10)));


        LocalDateTime date = LocalDateTime.parse("2017-03-21 00:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        date=date.plusHours(-5);
        System.out.println(date);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat.format(date));
    }
}
