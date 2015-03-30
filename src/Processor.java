import java.util.Queue;
import java.util.Random;

/**
 * Created by Andrii on 3/30/2015.
 */
public class Processor implements Runnable {

    @Override
    public void run() {
        Random randomNumber = new Random();
        while ((MainClass.getQueue1().size()!= 0)  && (MainClass.getQueue2().size() != 0) ){
            if (MainClass.getQueue1().size() > MainClass.getQueue2().size()){
                try {
                    Thread.sleep(MainClass.getQueue1().element());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else try {
                Thread.sleep(MainClass.getQueue2().element());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
