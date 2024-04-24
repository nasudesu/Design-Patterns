package Prototype;

public class Clock implements Cloneable {

    private ClockHand clockHand;

    public Clock(ClockHand clockHand){
        this.clockHand = clockHand;
    }

    public String getTime(){
        return clockHand.getHour() + ":" + clockHand.getMinute();
    }

    public void tick(){
        clockHand.setMinute(clockHand.getMinute() + 1);
        if(clockHand.getMinute() == 60){
            clockHand.setMinute(0);
            clockHand.setHour(clockHand.getHour() + 1);
        }
    }

    public Object clone(){
        try {
            Clock clock = (Clock) super.clone();
            clock.clockHand = (ClockHand) clockHand.clone();
            return clock;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Object shallowClone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

}
