package javaForImpatient.streams;

import reflection.Employee;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by teodor.miu on 21-Feb-17.
 */
public class Streams {
    void metodaMea(){

    }
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
        System.out.println("20170310000000".length());
        System.out.println("yyyyMMDDHHmmss".length());

        LocalDateTime date = LocalDateTime.parse("20170310000000",DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        date=date.plusHours(-1);
        System.out.println(date);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSS");
        System.out.println(dateFormat.format(date));

//        List<Employee> lista  = new ArrayList<>();
//        for(int i=0;i<100;i++){
//            lista.add(new Employee("Employee="+i,i));
//        }
////        lista.parallelStream().forEach(System.out::println);
//        Map<String,Employee> listaString = lista.stream().collect(Collectors.toMap(Employee::getName, t -> t));
//        Streams s = new Streams();
//        Long c=4234123L;
//        System.out.println(c.toString());
    }
}
