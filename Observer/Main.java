package Observer;

public class Main {
    public static void main(String[] args) {

        ClockTimer timer1 = new ClockTimer();
        DigitalClock clock = new DigitalClock(timer1);
        timer1.run();
    }
}
