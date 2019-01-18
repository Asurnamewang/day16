package thread_money_lock.thread_money;

public class Test {
    public static void main(String[] args) {
        Account a = new Account(1000);

        GetMoney gm = new GetMoney(a,800);

        Thread t1 = new Thread(gm,"张三");
        Thread t2 = new Thread(gm,"小三");

        t1.start();
        t2.start();

    }
}
