package Prototype;

public class Main {
    public static void main(String[] args) {
        ClockHand clockHand = new ClockHand(0, 12);
        Clock clock = new Clock(clockHand);

        System.out.println(clock.getTime());
        System.out.println("--------");

        for (int i = 0; i < 15; i++) {
            clock.tick();
        }

        System.out.println(clock.getTime());
        System.out.println("------");

        Clock clock2 = (Clock) clock.clone();
        System.out.println(clock2.getTime());

        for (int i = 0; i < 15; i++) {
            clock2.tick();
        }
        System.out.println("-------");
        System.out.println(clock.getTime());
        System.out.println(clock2.getTime());

        Clock clock3 = (Clock) clock.shallowClone();
        for (int i = 0; i < 15; i++) {
            clock.tick();
        }
        System.out.println("-------------");
        System.out.println(clock.getTime());
        System.out.println(clock3.getTime());

    }
}
