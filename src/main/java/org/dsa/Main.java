package org.dsa;

import org.dsa.service.Deque;
import org.dsa.service.QueueADT;
import org.dsa.service.impl.ArrayDequeImpl;
import org.dsa.service.impl.Josephus;
import org.dsa.service.impl.LinkedDequeImpl;
import org.dsa.service.impl.QueueImpl;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IllegalAccessException {
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

        System.out.println("Playing Josephus Game");
        String[] a1 = {"Alice", "Bob", "Cindy", "Doug", "Ed", "Fred"};
        String[] a2 = {"Gene", "Hope", "Irene", "Jack", "Kim", "Lance"};
        String[] a3 = {"Mike", "Roberto"};
        System.out.println("First winner is " + Josephus.play(Josephus.buildQueue(a1), 3));
        System.out.println("Second winner is " + Josephus.play(Josephus.buildQueue(a2), 10));
        System.out.println("Third winner is " + Josephus.play(Josephus.buildQueue(a3), 7));

        testDeque();
        testDequeListImpl();
    }

    private static void testDeque() throws IllegalAccessException {
        System.out.println("Array Based Implementation of Deque");
        Deque<String> deque = new ArrayDequeImpl<>(10);
        System.out.println("size: " + deque.size() + " is Empty: " + deque.isEmpty());
        deque.addFirst("Alice");
        deque.addLast("Bob");
        System.out.println("First: " + deque.first() + " Last: " + deque.last());
        deque.addLast("Cindy");
        deque.addFirst("Hope");
        System.out.println("First Removed: " + deque.removeFirst() + " Last Removed: " + deque.removeLast());
        deque.addFirst("Jack");
        System.out.println("First Removed: " + deque.removeFirst() + " Last Removed: " + deque.removeLast());
    }

    private static void testDequeListImpl() throws IllegalAccessException {
        System.out.println("Linked List Based Implementation of Deque");
        Deque<String> deque = new LinkedDequeImpl<>();
        System.out.println("size: " + deque.size() + " is Empty: " + deque.isEmpty());
        deque.addFirst("Alice");
        deque.addLast("Bob");
        System.out.println("First: " + deque.first() + " Last: " + deque.last());
        deque.addLast("Cindy");
        deque.addFirst("Hope");
        System.out.println("First Removed: " + deque.removeFirst() + " Last Removed: " + deque.removeLast());
        deque.addFirst("Jack");
        System.out.println("First Removed: " + deque.removeFirst() + " Last Removed: " + deque.removeLast());
    }
}