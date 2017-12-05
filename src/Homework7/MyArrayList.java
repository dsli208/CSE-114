/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//David S. Li, 110328771
package Homework7;

/**
 *
 * @author dsli
 */
public class MyArrayList {

    Object[] o = new Object[5];
    private int index = 0;

    public MyArrayList() {
    }

    public void add(Object ob) {
        if (index >= o.length) {
            Object[] copyArray = new Object[o.length * 2];
            System.arraycopy(o, 0, copyArray, 0, o.length);
            o = copyArray;
        }
        o[index++] = ob;
    }

    public void add(int i, Object ob) {
        if (index >= o.length) {
            Object[] copyArray = new Object[o.length * 2];
            System.arraycopy(o, 0, copyArray, 0, o.length);
            o = copyArray;
        }
        for (int j = index; j >= i; j--) {
            o[j] = o[j - 1];
        }
        o[i] = ob;
        index++;
    }

    public void clear() {
        Object[] copyArray = new Object[o.length];
        o = copyArray;
        index = 0;
    }

    public boolean contains(Object ob) {
        for (int i = 0; i < index; i++) {
            if (o[i].equals(ob)) {
                return true;
            }
        }
        return false;
    }

    public Object get(int i) {
        if (i < index) {
            return o[i];
        }
        else
            return "Null object here";
    }

    public int indexOf(Object ob) {
        for (int i = 0; i < index; i++) {
            if (o[i].equals(ob)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        for (int i = 0; i < index; i++) {
            if (o[i] != null) {
                return false;
            }
        }
        return true;
    }

    public int lastIndexOf(Object ob) {
        for (int i = index - 1; i >= 0; i--) {
            if (o[i].equals(ob)) {
                return i;
            }
        }
        return -1;
    }

    //If there is more than one instance of o, which one do we remove, the first or the last?
    public boolean remove(Object ob) {
        for (int i = 0; i < o.length; i++) {
            if (o[i].equals(ob)) {
                for (int j = i; j < o.length - 1; j++) {
                    o[j] = o[j + 1];
                }
                index--;
                return true;
            }
        }
        return false;
    }

    public int size() {
        return index;
    }

    public Object remove(int i) {
        if (i < index) {
            Object r = o[i];
            for (int j = i; j < o.length - 1; j++) {
                o[j] = o[j + 1];
            }
            index--;

            return r;
        }
        return "Null object here";
    }

    public Object set(int i, Object ob) {
        if (i >= index) {
            return "Index is too big.  Array needs to be substantially expanded (use add method instead).";
        }
        Object r = o[i];
        o[i] = ob;
        return r;
    }
}

class TestMyArray {

    public static void main(String[] args) {
        MyArrayList m = new MyArrayList();
        Account a = new Account();
        Time t = new Time();
        Account ac = new CheckingAccount(222, 1000, 60);
        Time t2 = new Time(1, 2, 3);
        Complex c1 = new Complex(5, 7);
        Complex c2 = new Complex();
        //Implementing the add(Object ob) method many times
        m.add(a);
        m.add(t);
        m.add(ac);
        m.add(t2);
        m.add(c1);
        //Implementing the add(int i, Object ob method)
        m.add(2, c2);
        m.add(t2);
        //contains(Object ob) method
        System.out.println(m.contains(c1));
        //get(int i) method
        System.out.println(m.get(0));
        //indexOf(Object ob) method
        System.out.println(m.indexOf(t2));
        //lastIndexOf(Object ob) method
        System.out.println(m.lastIndexOf(t2));
        //remove(Object ob) and remove(int i) methods respectively
        System.out.println(m.remove(t2));
        System.out.println(m.remove(5));
        //add one more object...
        Time t3 = new Time(55500055);
        //set(int i, Object ob) method
        System.out.println(m.set(2, t3));
        //size() method
        System.out.println(m.size());
        //isEmpty() method for the first time
        System.out.println(m.isEmpty());
        //Now use the clear() method and run the isEmpty method again()
        m.clear();
        System.out.println(m.contains(5));
        System.out.println(m.isEmpty());
    }
}
