package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        Iterator<Integer> iterator = numbers.iterator();

        // Luodaan kaksi säiettä, joilla kummallakin on oma iteraattori
        Thread thread1 = new Thread(new IteratorTask(numbers));
        Thread thread2 = new Thread(new IteratorTask(numbers));

        thread1.start();
        thread2.start();
    }
}
