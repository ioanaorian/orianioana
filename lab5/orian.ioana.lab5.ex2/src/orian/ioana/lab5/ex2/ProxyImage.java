package orian.ioana.lab5.ex2;

public class ProxyImage implements Image {

    private RealImage realImage;
    private RotatedImage rotatedImage;
    private String fileName;
    private int select;

    public ProxyImage(String fileName, int select) {
        if (select == 0) {
            this.select = 0;
        }
        if (select == 1) {
            this.select = 1;
        }

        this.fileName = fileName;
    }

    @Override
    public void display() {

        if (this.select == 0) {
            if (realImage == null) {
                realImage = new RealImage(fileName);
            }
            realImage.display();
        } else {
            if (rotatedImage == null) {
                rotatedImage = new RotatedImage(fileName);
            }
            rotatedImage.display();
        }
    }
}
