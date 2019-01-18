package thread_money_lock.thread_money;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class GetMoney implements Runnable{
    private Account a;
    private double num;
    private Lock l = new ReentrantLock();
    //private final ReentrantLock lock = new ReentrantLock();

    public GetMoney(Account a, double num){
        super();
        this.a = a;
        this.num = num;
    }

    @Override
    public void run() {
        l.lock();

        try {
            System.out.println(Thread.currentThread().getName()  +  "准备取款    账户余额为："  + a.getBalance() );
            if(a.getBalance() >= num){
                a.setBalance(a.getBalance()-num);
                System.out.println(Thread.currentThread().getName()  +  "本次取款金额为： " + num  + "取款后余额为：" + a.getBalance());
            }else{
                System.out.println(Thread.currentThread().getName()  + "余额不足");
            }
        }finally {
            l.unlock();
        }

    }
}
