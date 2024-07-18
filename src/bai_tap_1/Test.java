package bai_tap_1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Test {
    public static void main(String[] args) {
        //Ktra circle
        Circle circle = new Circle(5.0, "red");
        System.out.println(circle.toString());
        System.out.println("Diện tích là: " + circle.area());
        System.out.println("--------------------------------");

        Circle circle2 = new Circle(12.0, "0047FF");
        System.out.println(circle2.toString());
        System.out.println("Diện tích là: " + circle2.area());
        System.out.println("--------------------------------");

        // Ktra Cylinder
        Cylinder cylinder = new Cylinder(5.0, "blue", 10.0);
        System.out.println(cylinder.toString());
        System.out.println("Thể tích là: " + cylinder.volume());
        System.out.println("-------------------------------");

        Cylinder cylinder2 = new Cylinder(18.0, "FF455C", 16.0);
        System.out.println(cylinder2.toString());
        System.out.println("Thể tích là: " + cylinder2.volume());
        System.out.println("-------------------------------");
    }
}