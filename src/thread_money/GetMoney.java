package thread_money;

public class GetMoney implements Runnable{
    private Account a;
    private double num;

    public GetMoney(Account a,double num){
        super();
        this.a = a;
        this.num = num;
    }

    @Override
    public synchronized void run() {

        System.out.println(Thread.currentThread().getName()  +  "准备取款    账户余额为："  + a.getBalance() );
        if(a.getBalance() >= num){
            a.setBalance(a.getBalance()-num);
            System.out.println(Thread.currentThread().getName()  +  "本次取款金额为： " + num  + "取款后余额为：" + a.getBalance());
        }else{
            System.out.println(Thread.currentThread().getName()  + "余额不足");
        }
    }
}
