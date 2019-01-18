package thread_ticked;

public class TickedThread implements Runnable{
    private int num = 50;

    @Override
    public void run() {
        while (num>0){
            synchronized (this){
                if(num >0){
                    System.out.println(Thread.currentThread().getName() + "卖出第 :" + num + "张票");
                    num--;
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
