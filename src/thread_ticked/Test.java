package thread_ticked;

public class Test {
    public static void main(String[] args) {
        TickedThread t = new TickedThread();

        Thread t1 = new Thread(t,"1111");
        Thread t2 = new Thread(t,"2222");
        Thread t3 = new Thread(t,"3333");

        t1.start();
        t2.start();
        t3.start();

    }
}
