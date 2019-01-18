package timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
    /*
    * void schedule(TimerTask task, Date time) 在指定的时间安排指定的任务执行。 */

    public static void main(String[] args) {
        Timer t = new Timer();

        TimerTask task = new MyTimerTask();
        Date time = getTime();
        t.schedule(task,time);
    }
    private static Date getTime(){
        String str = "2019-01-06 16:33:30";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}

class MyTimerTask extends TimerTask{
    @Override
    public void run() {
        System.out.println("懒虫起床。。。");
    }
}
