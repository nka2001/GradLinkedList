/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.newlinkedlist;

/**
 *
 * @author nicka
 */
public interface ListMethods<T> {
    
    public void add(T addme);
    public boolean remove(T removeMe);
    public int size();
    public void clear();
    public boolean contains(T findMe);
    public boolean set(int index, T newVal);
    public boolean isEmpty();
    
    
}
