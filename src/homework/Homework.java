package homework;

public class Homework {
    public static void main(String[] args) {
        Ticket t = new Ticket();

        Thread t1 = new Thread(t,"111");
        Thread t2 = new Thread(t,"22222222222");
        Thread t3 = new Thread(t,"3333333");

        t3.start();
        t2.start();
        t1.start();
    }
}
