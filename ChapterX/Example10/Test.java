package Example10;
import java.util.Arrays;

/**
 *  Created by User on 22/05/2017.
 */
public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println(queue.empty());

        queue.enqueue(3);
        queue.enqueue(5);
        System.out.println(queue.getSize());

        System.out.println(Arrays.toString(queue.dequeue()));
        System.out.println(Arrays.toString(queue.dequeue()));

    }
}
