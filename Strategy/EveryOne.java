package Strategy;

public class EveryOne implements ListConverter{
    @Override
    public void listToString(String[] list) {
        StringBuilder result = new StringBuilder();
        for (String s : list) {
            result.append(s);
            result.append("\n");
        }
            System.out.print(result);
    }
}
