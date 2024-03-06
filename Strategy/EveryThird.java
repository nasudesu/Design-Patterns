package Strategy;

public class EveryThird implements ListConverter {
    @Override
    public void listToString(String[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+ " ");
            if (i % 3 == 2) {  // Check if it's the third iteration
                System.out.print("\n");
            }
        }
    }
}
