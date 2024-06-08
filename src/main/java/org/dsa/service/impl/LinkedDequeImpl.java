package org.dsa.service.impl;

import org.dsa.service.Deque;

import java.util.LinkedList;

public class LinkedDequeImpl<T> implements Deque<T> {
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
    public T first() {
        return list.getFirst();
    }

    @Override
    public T last() {
        return list.getLast();
    }

    @Override
    public void addFirst(T e) throws IllegalAccessException {
        list.addFirst(e);;
    }

    @Override
    public void addLast(T e) throws IllegalAccessException {
        list.addLast(e);
    }

    @Override
    public T removeFirst() {
        return list.removeFirst();
    }

    @Override
    public T removeLast() {
        return list.removeLast();
    }
}
