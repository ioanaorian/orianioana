package orian.ioana.lab5.ex2;


public final class RotatedImage implements Image {
  private String fileName;
 
   public RotatedImage(String fileName){
      this.fileName = fileName;
      display();
   }
 
   @Override
   public void display() {
      System.out.println("Displaying rotated image: " + fileName);
   }
    
}