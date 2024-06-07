package org.dsa.service;

public interface QueueADT<T> {
    int size();
    boolean isEmpty();
    void enqueue(T element);
    T first();
    T dequeue();
}
