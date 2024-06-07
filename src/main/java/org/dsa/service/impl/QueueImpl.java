package org.dsa.service.impl;

import org.dsa.service.QueueADT;

public class QueueImpl<T> implements QueueADT<T> {
    T[] arr;
    private int front = 0;
    private int size = 0;
    public QueueImpl(int capacity) {
        arr = (T[]) new Object[capacity];
    }
    public QueueImpl() {
        this(10);
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void enqueue(T element) {
        if (size < arr.length) {
            int temp = (front + size)%(arr.length);
            arr[temp] = element;
            size++;
        } else {
            throw new IllegalArgumentException("Queue already full");
        }
    }

    @Override
    public T first() {
        if (size == 0) return null;
        return arr[front];
    }

    @Override
    public T dequeue() {
        if (isEmpty()) return null;
        T temp = arr[front];
        arr[front] = null;
        front = (front+1)%(arr.length);
        size--;
        return temp;
    }
}
