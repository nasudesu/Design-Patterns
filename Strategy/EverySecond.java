package Strategy;

public class EverySecond implements ListConverter {
    @Override
    public void listToString(String[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+ " ");
            if (i % 2 == 1) {  // Check if it's the second iteration
                System.out.print("\n");
            }
        }
    }
}
