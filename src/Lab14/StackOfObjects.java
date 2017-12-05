/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab14;

/**
 *
 * @author dsli
 */
public class StackOfObjects {
    private int[] elements;
    private int size = 0;
    public StackOfObjects() {
        elements = new int[2];
    }
    public StackOfObjects(int capacity) {
        elements = new int[capacity];
    }
    public void push(int i) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size] = i;
        size++;
    }
    public int pop() {
        return elements[--size];
    }
    public int getSize() {
        return size;
    }
    public int peek() {
        return elements[size - 1];
    }
}
class TestStack {
    public static void main(String[] args) {
        StackOfObjects s = new StackOfObjects();
        s.push(30); s.push(1); s.push(4); s.push(6); s.push(38);
        int i = s.getSize();
        System.out.println(i);
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}