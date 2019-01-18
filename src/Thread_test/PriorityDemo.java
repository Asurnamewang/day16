package Thread_test;

public class PriorityDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.setPriority(10);
        t2.setPriority(10);

        t1.start();
        t2.start();

        Thread.sleep(50);
        System.exit(0);
    }
}

class MyThread1 extends Thread{
    private int i = 0;
    @Override
    public void run() {
        while (i < 10000){
            System.out.println("Java视频教程 已经下载  " +  i   +  "%");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    private int i = 1;
    @Override
    public void run() {
        while (i < 10000){
            System.out.println("高清电影 已经下载  " +  i   +  "%-----------------");
            i++;
        }
    }
}
