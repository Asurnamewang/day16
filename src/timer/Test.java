package timer;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Frame f = new Frame();
        Label l = new Label("2019-01-06 16:40");
        f.add(l);

        f.setVisible(true);
        f.setSize(200,100);
        f.setLocation(300,200);

        while (true){
            l.setText(getTime());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private static String getTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }
}
