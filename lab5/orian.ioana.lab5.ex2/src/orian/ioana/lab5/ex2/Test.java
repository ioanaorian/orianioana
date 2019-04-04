package orian.ioana.lab5.ex2;

public class Test {

    public static void main(String[] args) {
        RealImage r1 = new RealImage("Image1");
        RotatedImage r2 = new RotatedImage("RotatedImage1");
        ProxyImage p1 = new ProxyImage("Image1", 1);
        ProxyImage p2 = new ProxyImage("Image1", 0);
    }
}
