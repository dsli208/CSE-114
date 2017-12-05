/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework6;

/**
 *
 * @author dsli
 */
public class MyInteger {
    private int value;
    public MyInteger(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public boolean isEven() {
        return (value % 2 == 0);
    }
    public boolean isOdd() {
        return (value % 2 != 0);
    }
    public boolean isPrime() {
        for (int i = 2; i < value; i++) {
            if (value % i == 0)
                return false;
        }
        return true;
    }
    //isEven, isPrime, and isOdd methods with int parameters
    public static boolean isEven(int i) {
        return (i % 2 == 0);
    }
    public static boolean isOdd(int i) {
        return (i % 2 != 0);
    }
    public static boolean isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0)
                return false;
        }
        return true;
    }
    //The same methods as above, but this time we accept a MyInteger object as a parameter
    public static boolean isEven(MyInteger m) {
        return (m.getValue() % 2 == 0);
    }
    public static boolean isOdd(MyInteger m) {
        return (m.getValue() % 2 != 0);
    }
    public static boolean isPrime(MyInteger m) {
        int k = m.getValue();
        for (int j = 2; j < k; j++) {
            if (k % j == 0)
                return false;
        }
        return true;
    }
    //equals methods - first method contains an int parameter, the second contains a MyInteger object parameter
    public boolean equals(int i) {
        if (value == i)
            return true;
        return false;
    }
    public boolean equals(MyInteger m) {
        if (value == m.getValue())
            return true;
        return false;
    }
    //parseInt method
    public static int parseInt(String s) {
        int sum = 0;
        for (int i = s.length() - 1, j = 0; i >= 0; i--, j++) {
            sum = sum + (int)(Math.pow(10, j)) * (s.charAt(i) - 48);
        }
        return sum;
    }
}

class TestMyInteger {
    public static void main(String[] args) {
        //Create the object
        MyInteger a = new MyInteger(3);
        //getValue()
        System.out.println(a.getValue());
        //Test isEven(), isOdd(), and isPrime()
        System.out.println("Is it even? " + a.isEven() + ".  Is it odd? " + a.isOdd() + ".  Is it prime? " + a.isPrime());
        //Now test the versions of these methods that take an int parameter
        System.out.println("The integer we are testing here is 3.  Is it odd? " + a.isOdd(3) + " is it even? " + a.isEven(3) + " is it prime? " + a.isPrime(3));
        //Create a new myInteger object to test with the MyInteger equivalent of the above methods
        MyInteger test = new MyInteger(10);
        System.out.println("Is it even? " + a.isEven(test) + " Is it odd? " + a.isOdd(test) + " Is it prime? " + a.isPrime(test));
        //Now test the equals methods
        //Starting with the int parameter
        System.out.println(a.equals(3));
        //Now the object parameter
        System.out.println(a.equals(test));
        //Test the parseInt method - note even though it is static, we still need to have created the object
        int b = a.parseInt("34897");
        System.out.println(b);
    }
}