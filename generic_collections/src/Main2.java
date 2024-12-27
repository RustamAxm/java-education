import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> deque = new LinkedList<>();
        int count = 0;
        while (scanner.hasNextInt()) {
            if (count % 2 == 0) {
                scanner.next();
            } else {
                deque.add(scanner.nextInt());
            }
            count++;
        }

        Iterator<Integer> x = deque.descendingIterator();
        while (x.hasNext()) {
            System.out.print(x.next() + " ");
        }
    }
}
