package com.kda271294.Incapsul;

public class Rectangle {

    private Point pointOne;
    private Point pointTwo;

    public int square(Point pointOne, Point pointTwo) {

        int vertical = pointTwo.getY()- pointOne.getY();
        int horizontal = pointTwo.getX()- pointOne.getX();

        return vertical*horizontal;
    }

    public double diagonal(Point pointOne, Point pointTwo) {
        double vertical = pointTwo.getY()- pointOne.getY();
        double horizontal = pointTwo.getX()- pointOne.getX();

        return Math.sqrt(Math.pow(vertical,2)+Math.pow(horizontal,2));
    }
}
