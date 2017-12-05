/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab21;
import Lab20.*;
/**
 *
 * @author dsli
 */
public interface Colorable {
    public void howToColor();
}

class Square extends GeometricObject implements Colorable {
    private double side;
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
    @Override
    public double getPerimeter() {
        return side * 4;
    }
    @Override
    public double getArea() {
        return side * side;
    }
    public Square(double side) {
        this.side = side;
    }
}

class TestDriver {
    public static void main(String[] args) {
        GeometricObject[] g = new GeometricObject[5];
        g[0] = new Square(2);
        g[1] = new Square(5);
        g[2] = new Circle(5);
        g[3] = new Rectangle(1, 2);
        g[4] = new Square(1);
        for (int i = 0; i < g.length; i++) {
            if (g[i] instanceof Colorable) 
                ((Colorable)g[i]).howToColor();
        }
    }
}