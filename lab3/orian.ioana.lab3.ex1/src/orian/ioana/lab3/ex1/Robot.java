package orian.ioana.lab3.ex1;

public class Robot {
    
    private int x;
    public Robot() {
        this.x =1;
    }
    void change(int k){
    	if(k>=1){
            x=k;
        }
   }
    @Override
    public String toString() {
        return "Pozitia robotului{" +
                "x=" + x +
                '}';
    }
    
}
