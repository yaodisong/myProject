package com.pps.bridgedemo;

public class BridgeTest {

    public static void main(String[] args) {
        Circle redCircle = new Circle(5, 20, 30, new RedCircle());
        Circle greenCircle = new Circle(10, 30, 20, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}
