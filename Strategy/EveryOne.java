package Strategy;

public class EveryOne implements ListConverter{
    @Override
    public String listToString(String[] list) {
        String result = "";
        for (int i = 0; i < list.length; i++) {
            result += list[i] + " ";
        }
        return result;
    }
}
