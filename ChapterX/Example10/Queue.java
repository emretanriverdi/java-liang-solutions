package Example10;

/**
 *  Created by User on 22/05/2017.
 */
public class Queue {
    int[] elements;
    int size;

    public Queue() {
        elements = new int[8];
    }

    public void enqueue(int v) {
        elements[size] = v;
        size++;
    }

    public int[] dequeue() {
        int[] temp = elements;
        elements = new int[8];
        return temp;
    }

    public boolean empty() {
        for (int i = 0; i < elements.length; i++)
            if (elements[i] != 0)
                return false;
        return true;
    }

    public int getSize() {
        return size;
    }

}
