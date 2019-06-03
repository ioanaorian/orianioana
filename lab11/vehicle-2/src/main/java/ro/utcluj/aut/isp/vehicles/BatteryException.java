package ro.utcluj.aut.isp.vehicles;

public class BatteryException extends Exception {
    int c;
    
    BatteryException(int c,String msg){
        super(msg);
        this.c=c;
    }
    
    

}

