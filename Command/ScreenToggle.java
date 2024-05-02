package Command;

public class ScreenToggle implements Command{
    private Screen screen;

    public ScreenToggle(Screen screen) {
        this.screen = screen;
    }

    public void execute() {
        screen.toggle();
    }
}
