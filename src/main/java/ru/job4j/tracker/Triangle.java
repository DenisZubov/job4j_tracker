package ru.job4j.tracker;

import static java.lang.Math.sqrt;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;


        public static double period ( double ab, double ac, double bc){
            double period = (ab + ac + bc)/2;
            return period;
        }

        public boolean exist ( double ab, double ac, double bc) {
            if (((ab + ac) > bc) && ((ab + bc) > ac) && ((bc + ac) > ab)) {
                return true;
            }
            return false;
        }

        public static double area(Point first, Point second, Point third){
            double ab = first.distance(second);
            double ac = first.distance(third);
            double bc = second.distance(third);
            double p = period(ab, ac, bc);
            double area = sqrt(p * (p - ab) * (p - ac) * (p - bc));
            return area;
        }
    public static void main(String[] args) {
        Point x = new Point(1, 0);
        Point y = new Point(4, 0);
        Point z = new Point(0, 8);
        double rsl = area(x, y, z);
        System.out.println(rsl);
    }

}