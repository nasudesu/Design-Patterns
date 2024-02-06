package Observer;

public class ClockTimer extends Subject implements Runnable{

    private int hour;
    private int minute;
    private int second;

    public ClockTimer(){
        hour = 0;
        minute = 0;
        second = 0;
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    public void setHour(int h){
        hour = h;
    }

    public void setMinute(int m){
        minute = m;
    }

    public void setSecond(int s){
        second = s;
    }

    public void tick(){
        second++;
        if (second >= 60){
            second = 0;
            minute++;
            if (minute >= 60){
                minute = 0;
                hour++;
                if (hour >= 24){
                    hour = 0;
                }
            }
        }
        notifyObservers();
    }

    @Override
    public void run() {
        System.out.println("ClockTimer is running");
        while (true){
            tick();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
