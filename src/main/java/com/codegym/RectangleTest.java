package com.codegym;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        Rectangle rectangle1 = new Rectangle(10.0, 20.0);
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle("back", false, 15.0, 25.0);
        System.out.println(rectangle2);
    }
}
