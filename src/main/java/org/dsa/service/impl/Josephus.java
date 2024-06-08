package org.dsa.service.impl;

import org.dsa.service.CircularQueueADT;

public class Josephus {
    public static<T> T play(CircularQueueADT<T> queue, int k) {
        if (queue.isEmpty()) return null;
        while (queue.size() > 1) {
            for (int i = 0; i< k-1; i++) {
                queue.rotate();
            }
            T temp = queue.dequeue();
            System.out.println(temp + "\t" + "is out of the game");
        }

        return queue.dequeue();
    }

    public static<T> CircularQueueADT<T> buildQueue(T[] arr) {
        CircularQueueADT<T> queueADT = new LinkedCircularQueue<>();

        for (T ele : arr) {
            queueADT.enqueue(ele);
        }

        return queueADT;
    }
}
