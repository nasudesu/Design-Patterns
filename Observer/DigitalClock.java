package Observer;

public class DigitalClock implements Observer{

    private ClockTimer timer;

    public DigitalClock(ClockTimer ct){
        timer = ct;
        timer.registerObserver(this);
    }

    public void update() {
        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();
        System.out.println(hour + ":" + minute + ":" + second);
    }

}
