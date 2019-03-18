package orian.ioana.lab4.ex5;

public class TestCylinder {

    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        System.out.println(c1.getRadius() + " " + c1.getHeight());
        Cylinder c2=new Cylinder(5.5);
        System.out.println(c2.getRadius());
        System.out.println(c1.getArea());
        System.out.println(c2.getVolume());
    }

}
