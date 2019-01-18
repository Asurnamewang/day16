package homework;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket  implements Runnable{

    private int num = 50;

    @Override
    public synchronized void run() {
        while (num>0){
            System.out.println(Thread.currentThread().getName() + "卖出第： " + num + "张票");
            num--;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
