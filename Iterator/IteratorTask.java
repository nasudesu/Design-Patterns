package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTask implements Runnable {

    private ArrayList<Integer> numbers;

    public IteratorTask(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }


    @Override
    public void run() {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(Thread.currentThread().getName() + ": " + number);

            // Tehdään jotain odottamattomia muutoksia
            if (number == 3 && Thread.currentThread().getName().equals("Thread-0")) {
                numbers.remove(number);
            } else if (number == 4 && Thread.currentThread().getName().equals("Thread-1")) {
                numbers.add(6);
            }
        }
    }
}
