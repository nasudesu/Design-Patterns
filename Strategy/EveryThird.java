package Strategy;

public class EveryThird implements ListConverter {
    @Override
    public String listToString(String[] list) {
        String result = "";
        for (int i = 0; i < list.length; i+=3) {
            result += list[i] + " ";
        }
        return result;
    }
}
