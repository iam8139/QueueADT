package org.dsa.service.impl;

import org.dsa.service.Deque;

public class ArrayDequeImpl<T> implements Deque<T> {
    T[] arr;
    private int size = 0;
    private int first = 0;
    public ArrayDequeImpl(int CAPACITY) {
        arr = (T[]) new Object[CAPACITY];
    }
    public ArrayDequeImpl() {
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
    public T first() {
        if (isEmpty()) return null;
        return arr[first];
    }

    @Override
    public T last() {
        if (isEmpty()) return null;
        return (arr[first+size-1]);
    }

    @Override
    public void addFirst(T e) throws IllegalAccessException {
        if (size >= arr.length) throw new IllegalAccessException("Deque Already Full");
        if (first > 0) {
            int index = (first-1)%arr.length;
            arr[index] = e;
            first--;
        } else {
            shift();
            arr[first] = e;
        }
        size++;
    }

    private void shift() {
        for (int i = first+size; i > first; i--) {
            arr[i] = arr[i-1];
        }
    }

    @Override
    public void addLast(T e) throws IllegalAccessException {
        if (size >= arr.length) throw new IllegalAccessException("Deque Already Full");
        int index = (first+size)%arr.length;
        arr[index] = e;
        size++;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) return null;
        T temp = arr[first];
        arr[first++] = null;
        size--;
        return temp;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) return null;
        T temp = arr[first+size-1];
        arr[first+size-1] = null;
        size--;
        return temp;
    }
}
