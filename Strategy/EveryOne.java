package Strategy;

public class EveryOne implements ListConverter{
    @Override
    public void listToString(String[] list) {
        for (String s : list) {
            System.out.print(s + "\n");
        }
    }
}
