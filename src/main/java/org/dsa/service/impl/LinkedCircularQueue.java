package org.dsa.service.impl;

import org.dsa.service.CircularQueueADT;
import org.dsa.service.CircularlyLinkedList;

public class LinkedCircularQueue<T> implements CircularQueueADT<T> {
    CircularlyLinkedList<T> list = new CircularlyLinkedListImpl<>();
    @Override
    public void rotate() {
        list.rotate();
    }

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
        return list.first();
    }

    @Override
    public T dequeue() {
        return list.removeFirst();
    }
}
