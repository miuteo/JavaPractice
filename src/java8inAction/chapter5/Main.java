package java8inAction.chapter5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by teodor.miu on 20-Mar-17.
 */
public class Main {

    public static List<Transaction> transactions;
    static{
        Trader raoul = new Trader("Raoul","Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        transactions = Arrays.asList(
          new Transaction(brian,2011,300),
          new Transaction(raoul,2012,1000),
          new Transaction(raoul,2011,400),
          new Transaction(mario,2012,710),
          new Transaction(mario,2012,700),
          new Transaction(alan,2012,950)
        );
    }
    public static void main(String[]args){
        //find all transactions in the year 2011 and sort them by value(small to high)
        transactions.stream().filter(t -> t.getYear()==2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .forEach(t-> System.out.println(t));
        //what are all the unique cities where the traders work?
        System.out.println("what are all the unique cities where the traders work?");
        transactions.stream().map(trans -> trans.getTrader().getCity()).distinct().forEach(t-> System.out.println(t));
        System.out.println();

        //find all trader from Cambridge and sort them by name
        System.out.println("find all trader from Cambridge and sort them by name");
        transactions.stream().map(Transaction::getTrader)
                .distinct()
                .filter(t -> t.getCity().equals("Cambridge"))
//                .sorted((t1,t2)->t1.getTrader().getName().compareTo(t2.getTrader().getName()))
                .sorted(Comparator.comparing(Trader::getCity))
                .forEach(trader -> System.out.println(trader.getName()));
        System.out.println();

        System.out.println("Are any traders based in Milan?");
        System.out.println(transactions.stream().map(t->t.getTrader().getCity()).anyMatch(city -> city.equals("Milan")));
        System.out.println();

        System.out.println("print all transaction values from the traders living in Cambridge");
        transactions.stream().filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .forEach(t-> System.out.println(t.getValue()));
        System.out.println();

        System.out.println("Find The transaction with the smalest value");
        System.out.println(transactions.stream().min(Comparator.comparingInt(Transaction::getValue)).orElse(null));
//        ArrayList<Long> listaLunga = new ArrayList<>();
//        long start =System.currentTimeMillis();
//        for(long i=0;i<50.0;i++){
//            listaLunga.add(i);
//        }
//        long endAdd = System.currentTimeMillis()-start;
//
//
//        start = System.currentTimeMillis();
//        long suma =0;
//        for(Long i:listaLunga){
//            if(i==2){
//                break;
//            }
//        }
//        long endIterate = System.currentTimeMillis()-start;
//
//        start=System.currentTimeMillis();
//        listaLunga.stream().filter(value->value==2).findFirst().orElse(null);
//        long endStreamSeq = System.currentTimeMillis()-start;
//
//        start=System.currentTimeMillis();
//        listaLunga.parallelStream().filter(value->value==2).findAny().orElse(null);
//        long endStreamParallel = System.currentTimeMillis()-start;
//
//
//
//        System.out.println("endAdd="+endAdd);
//        System.out.println("endIterate="+endIterate);
//        System.out.println("endStreamParallel="+endStreamParallel);
//        System.out.println("endStreamSeq="+endStreamSeq);


    }

}
