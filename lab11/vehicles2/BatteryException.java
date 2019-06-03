package ro.utcluj.aut.isp.vehicles2;


public class BatteryException extends Exception {
    int c;
    
    BatteryException(int c,String msg){
        super(msg);
        this.c=c;
    }
    
    

}


