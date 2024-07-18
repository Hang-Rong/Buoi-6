package bai_tap_3;

public class Test {
    public static void main(String[] args) {
        // Ktra Point class
        Point point = new Point(1.0f, 2.0f);
        System.out.println("Point: " + point);

        point.setX(3.0f);
        point.setY(4.0f);
        System.out.println("Point after setting X and Y: " + point);
        System.out.println("-------------------------------------");

        // Ktra MovablePoint class
        MovablePoint movablePoint = new MovablePoint(5.0f, 6.0f, 1.0f, 2.0f);
        System.out.println("MovablePoint: " + movablePoint);

        movablePoint.move();
        System.out.println("MovablePoint after moving: " + movablePoint);
        System.out.println("-------------------------------------");
    }
}