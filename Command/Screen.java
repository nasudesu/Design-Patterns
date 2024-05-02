package Command;

public class Screen {

    private boolean on;
    public void turnOn() {
        System.out.println("Valkokangas: Alas");
    }

    public void turnOff() {
        System.out.println("Valkokangas: Ylös");
    }

    public void toggle() {
        if (on) {
            turnOff();
            on = false;
        } else {
            turnOn();
            on = true;
        }
    }
}
