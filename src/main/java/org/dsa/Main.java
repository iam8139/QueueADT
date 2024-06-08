package org.dsa;

import org.dsa.service.QueueADT;
import org.dsa.service.impl.QueueImpl;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Array based Queue Implementation");

        QueueADT<Integer> queueADT = new QueueImpl<>(10);
        System.out.println("Is Empty: " + queueADT.isEmpty());
        queueADT.enqueue(10);
        System.out.println("size: " + queueADT.size());
        System.out.println("first: " + queueADT.first());
        queueADT.enqueue(20);
        queueADT.enqueue(30);
        queueADT.enqueue(40);
        System.out.println("dequeue: " + queueADT.dequeue());
        System.out.println("size: " + queueADT.size());
        System.out.println("first: " + queueADT.first());
        System.out.println("dequeue: " + queueADT.dequeue());
        System.out.println("size: " + queueADT.size());
        System.out.println("first: " + queueADT.first());

        System.out.println("LinkedList based Queue Implementation");

        QueueADT<Integer> queueADT2 = new QueueImpl<>(10);
        System.out.println("Is Empty: " + queueADT2.isEmpty());
        queueADT2.enqueue(10);
        System.out.println("size: " + queueADT2.size());
        System.out.println("first: " + queueADT2.first());
        queueADT2.enqueue(20);
        queueADT2.enqueue(30);
        queueADT2.enqueue(40);
        System.out.println("dequeue: " + queueADT2.dequeue());
        System.out.println("size: " + queueADT2.size());
        System.out.println("first: " + queueADT2.first());
        System.out.println("dequeue: " + queueADT2.dequeue());
        System.out.println("size: " + queueADT2.size());
        System.out.println("first: " + queueADT2.first());
    }
}