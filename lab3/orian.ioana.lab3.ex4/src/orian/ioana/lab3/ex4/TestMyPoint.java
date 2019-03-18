package orian.ioana.lab3.ex4;

public class TestMyPoint {

    public static void main(String[] args) {

        MyPoint p1 = new MyPoint();
        System.out.println(p1);
        MyPoint p2 = new MyPoint(10, 3);
        System.out.println(p2);
        int d1 = p1.getX();
        System.out.println(d1);
        int d2 = p2.getY();
        System.out.println(d2);
        p1.setX(2);
        System.out.println(p1);
        p2.setY(15);
        System.out.println(p2);
        p1.setXY(12, 13);
        System.out.println(p1.toString());

    }

}
