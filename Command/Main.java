package Command;

public class Main {
    public static void main(String[] args) {

        Screen screen = new Screen();
        Command toggle = new ScreenToggle(screen);
        WallButton button = new WallButton(toggle);
        button.push();
        button.push();
        button.push();
    }
}
