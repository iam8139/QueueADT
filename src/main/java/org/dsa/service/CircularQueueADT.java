package org.dsa.service;

public interface CircularQueueADT<T> extends QueueADT<T> {
    void rotate();
}
