package bai_tap_2;

public class PointTest {
    public static void main(String[] args) {
        //Ktra point 2D
        Point2D point2D = new Point2D(1.0f, 2.0f);
        System.out.println(point2D.toString());
        point2D.setXY(3.0f, 4.0f);
        System.out.println(point2D.toString());
        float[] xy = point2D.getXY();
        System.out.println("X: " + xy[0] + ", Y: " + xy[1]);
        System.out.println("------------------------------");

        //Ktra point3D
        Point3D point3D = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println(point3D.toString());
        point3D.setXYZ(4.0f, 5.0f, 6.0f);
        System.out.println(point3D.toString());
        float[] xyz = point3D.getXYZ();
        System.out.println("X: " + xyz[0] + ", Y: " + xyz[1] + ", Z: " + xyz[2]);
        System.out.println("------------------------------");
    }
}

