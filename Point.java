package com.kda271294.Incapsul;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void distance(Point point){
        System.out.println("Расстояние до точки Х" + (x - point.x));
        System.out.println("Расстояние до точки Y" + (y - point.y));
    }
}
