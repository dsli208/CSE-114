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
public class ExHandling {
    public static void main(String[] args) {
        try {
            System.out.println(divide(1 , 0));
        }
        catch (Exception e) {
            System.out.println("Wrong division");
        }
    }
    public static int divide(int i, int j) {
        return (i / j);
    }
}
