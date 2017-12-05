/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalReview;

/**
 *
 * @author dsli
 */
public class TestWrapper {
    public static void main(String[] args) {
        Number i = new Integer(5);
        i = (Integer)i + 1; //This statement will not work with Number data type, you MUST CAST DOWN
        System.out.println(i);
        Character c = new Character('a');
        Integer j = Integer.valueOf("100");
        System.out.println(j);
        System.out.println(c);
    }
}
