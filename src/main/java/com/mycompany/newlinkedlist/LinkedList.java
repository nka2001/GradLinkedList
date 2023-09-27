/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newlinkedlist;

import java.util.Iterator;

/**
 *
 * this class will hold a non-circular, doubly linked list (with a head and tail node
 * for easier insertions and deletes(basically two dummy nodes))
 *
 * @author nicka
 */
public class LinkedList<T> implements Iterable<T>, ListMethods {

    private int listSize;
    public Node<T> head;
    public Node<T> tail;
    
    @Override
    public void add(Object addme) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean remove(Object removeMe) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int size() {
        return this.listSize;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean contains(Object findMe) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean set(int index, Object newVal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isEmpty() {
        return listSize == 0;
    }

    /**
     * node class, is an inner class
     *
     * @param <T>
     */
    private static class Node<T> {

        public T data;
        public Node<T> next;
        public Node<T> prev;

        public Node() {

            data = (T) "";
            next = null;
            prev = null;

        }

    }

    /**
     * iterator for linked list does not support remove at this time only next
     * and hasnext
     *
     * @return
     */
    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
    
    
  
    
}
