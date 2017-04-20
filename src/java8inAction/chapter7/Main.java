package java8inAction.chapter7;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.stream.LongStream;

/**
 * Created by teodor.miu on 30-Mar-17.
 */
public class Main {
    public static void main(String[]args){
        System.out.println("parallel range sum done in: " + measureSumPerf(Main::sideEffectSum,10_000_000)+"msecs");
//        String date ="2017-05-06 01:29:59";
//        System.out.println(date.replaceAll("\\-","").replaceAll("[ :]",""));
        AtomicLong a;
    }

    public static long measureSumPerf(Function<Long,Long> adder,long n){
        long fastest = Long.MAX_VALUE;
        for(int i=0;i<10;i++){
            long start = System.nanoTime();
            long result = adder.apply(n);
            long duration = (System.nanoTime()-start)/1_000_000;
            System.out.println("Result: "+ result);
            if(duration<fastest) fastest=duration;
        }
        return fastest;
    }

    public static long sideEffectSum(long n){
        Accumulator accumulator = new Accumulator();
//        LongStream.rangeClosed(1,n).forEach(value -> accumulator.add(value));
        LongStream.rangeClosed(1,n).parallel().forEach(accumulator::add);
        return accumulator.total;

    }
}
