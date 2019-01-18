package homework;

public class Ticket1 implements Runnable{
    private int num = 100;
    private int count = 1;

    @Override
    public synchronized void  run() {

            num--;
            System.out.println(Thread.currentThread().getName() + "卖出第" + count + "张票" +"\n" + "还剩下" + num + "张票");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;

    }
}
