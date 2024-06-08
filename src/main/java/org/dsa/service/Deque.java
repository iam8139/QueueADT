package org.dsa.service;

public interface Deque<T> {
    int size();
    boolean isEmpty();
    T first();
    T last();
    void addFirst(T e) throws IllegalAccessException;
    void addLast(T e) throws IllegalAccessException;
    T removeFirst();
    T removeLast();
}
