package java8inAction.chapter7;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

/**
 * Created by teodor.miu on 20-Apr-17.
 */
public class ForkJoinSumCalculator extends java.util.concurrent.RecursiveTask<Long> {
    private final long[] numbers;
    private final int start;
    private final int end;

    public static final long THRESHOLD = 10_000;

    public ForkJoinSumCalculator(long[] numbers){
        this(numbers,0,numbers.length);
    }
    private ForkJoinSumCalculator(long[] numbers, int start,int end){
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        int length = end - start;
        if(length <= THRESHOLD){
            return computeSequentially();
        }
        ForkJoinSumCalculator leftTask =
                new ForkJoinSumCalculator(numbers,start,start + length/2);//create a substak to sum the first half of the array
        leftTask.fork();//asynchronously execute the newly created substask using another thread of the ForkJoinPool

        ForkJoinSumCalculator rightTask =
                new ForkJoinSumCalculator(numbers,start + length/2,end);//create a subtask to sum the second half of the array
//        rightTask.fork();
        Long rightResult = rightTask.compute();//execute this second subtask syncronously,potentially allowing further recursive splits
        Long leftResult = leftTask.join(); //read the result of the first subtask or wait for it if it isn't ready
        return leftResult+rightResult;
    }

    private long computeSequentially(){
        long sum = 0;
        for(int i=start;i<end;i++){
            sum+=numbers[i];
        }
        return sum;
    }
    public static long forkJoinSum(long n){
        long[] numbers = LongStream.rangeClosed(1,n).toArray();
        ForkJoinTask<Long> task = new ForkJoinSumCalculator(numbers);
        return new ForkJoinPool().invoke(task);
    }

    public static void main(String[]args){
        System.out.println(forkJoinSum(10_000_000));
    }
}
