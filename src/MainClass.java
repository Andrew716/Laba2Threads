import java.util.ArrayDeque;
import java.util.Random;

/**
 * Created by Andrii on 3/30/2015.
 */
public class MainClass{
    public final static int DEPTH = 5;
    public final static int LOW_RANDOM_NUMBER = 400;
    public final static int HIGH_RANDOM_NUMBER = 600;
    private static ArrayDeque<Integer> queue1 = new ArrayDeque<Integer>(DEPTH);

    public static ArrayDeque<Integer> getQueue2() {
        return queue2;
    }

    public static ArrayDeque<Integer> getQueue1() {
        return queue1;
    }

    private static ArrayDeque<Integer> queue2 = new ArrayDeque<Integer>(DEPTH);

        public static void main(String [] args){
            Random randomNumber = new Random();

            Processor processor1 = new Processor();
            Processor processor2 = new Processor();
            Thread thread1 = new Thread(processor1);
            for (int i = 0; i < queue1.size(); i++){
                queue1.add(randomNumber.nextInt(HIGH_RANDOM_NUMBER - LOW_RANDOM_NUMBER) + LOW_RANDOM_NUMBER);
            }
            thread1.start();
            Thread thread2 = new Thread(processor2);
            for (int i = 0; i < queue2.size(); i++){
                queue1.add(randomNumber.nextInt(HIGH_RANDOM_NUMBER - LOW_RANDOM_NUMBER) + LOW_RANDOM_NUMBER);
            }
            thread2.start();
        }

}
