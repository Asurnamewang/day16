package Thread_test;

public class JoinDemo {
    /*
    * void join()     等待这个线程终止。
     * 一旦在一个线程对象上调用此方法，那么必须让该线程先执行完 再执行其他线程*/
    public static void main(String[] args) throws InterruptedException {
        JoinThread jt = new JoinThread();
        jt.start();

        for (int j=0;j<100;j++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (j ==10){
                jt.join();
            }
            System.out.println("main----"  + j);
        }

    }
}

class JoinThread extends Thread{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("join------------------"  +  i);
        }
    }
}
