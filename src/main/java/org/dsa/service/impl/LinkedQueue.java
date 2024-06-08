package org.dsa.service.impl;

import org.dsa.service.QueueADT;

import java.util.LinkedList;

public class LinkedQueue<T> implements QueueADT<T> {
    LinkedList<T> list = new LinkedList<>();
    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void enqueue(T element) {
        list.addLast(element);
    }

    @Override
    public T first() {
        return list.getFirst();
    }

    @Override
    public T dequeue() {
        return list.removeFirst();
    }
}
