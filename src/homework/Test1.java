package homework;

public class Test1 {
    public static void main(String[] args) {
        Ticket1 t1 = new Ticket1();

        Thread t11 = new Thread(t1,"111");
        Thread t22 = new Thread(t1,"22222222");
        Thread t33 = new Thread(t1,"3333333333333");

        t11.start();
        t22.start();
        t33.start();
    }
}
