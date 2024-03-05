package Strategy;

public class EverySecond implements ListConverter{
    @Override
    public String listToString(String[] list) {
        String result = "";
        for (int i = 0; i < list.length; i+=2) {
            result += list[i] + " ";
        }
        return result;
    }
}
