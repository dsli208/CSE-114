/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LectureNotes9to13;

/**
 *
 * @author dsli
 */
public class MyArrayList {

    private Object[] elements = new Object[12];
    private int size = 0;

    public void add(Object o) {
        if (size == elements.length) {
            Object[] temp = new Object[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = o;
    }

    public Object remove() {
        return elements[--size];
    }
    public int size() {
        return size;
    }
    
    public int indexOf(Object o) {
        for (int i = 0; i < elements.length; i++) {
            if (o.equals(elements[i]))
                return i;
        }
        return -1;
    }
}
