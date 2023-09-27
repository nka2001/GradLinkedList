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
public class LinkedList<T> implements Iterable<T> {

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

    private int listSize;
    public Node<T> head;
    public Node<T> tail;
    
    
    public int size(){
        
    }
    
    public boolean isEmpty(){
        
    }
    
    public void clear(){
        
    }
    
    public boolean contains(T findMe){
        
    }
    
    public boolean remove(T removeMe){
        
    }
    
    public boolean add(T addMe){
        
    }
    
    public boolean set(int index){
        
    }
    
}
