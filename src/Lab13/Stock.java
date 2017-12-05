/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab13;

/**
 *
 * @author dsli
 */
public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    public void setPreviousClosingPrice(double newPreviousClosingPrice) {
        previousClosingPrice = newPreviousClosingPrice;
    }
    public void setCurrentPrice(double newPrice) {
        currentPrice = newPrice;
    }
    public double changePercent() {
        return (Math.abs(currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}

class TestStock {
    public static void main(String[] args) {
        Stock google = new Stock("GOOG", "Google Inc.");
        google.setPreviousClosingPrice(100);
        google.setCurrentPrice(90);
        System.out.println(google.changePercent() + "%");
    }
}