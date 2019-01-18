package Thread_test;

public class YieldDemo {
    public static void main(String[] args) {
        YieldThread yt = new YieldThread();
        yt.start();

        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0) {
                Thread.yield();
            }
            System.out.println("main---" + i);
        }
    }
}

class YieldThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("yield---------" + i);
        }
    }
}
