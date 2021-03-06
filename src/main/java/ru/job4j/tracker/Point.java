package ru.job4j.tracker;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(5, 0);
        Point b = new Point(4, 4);
        Point c = new Point(1,5);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}