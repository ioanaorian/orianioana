package ro.utcluj.aut.isp.vehicles;
import java.util.*;

public class Parking {
    
    ArrayList<Vehicle> parkedVehicles=new ArrayList<Vehicle>();

    public void parkVehicle(Vehicle e){

           parkedVehicles.add(e);
    }

    /**
     * Sort vehicles by length.
     */
    public void sortByWeight(){
    Collections.sort(parkedVehicles,new WeightSort());
    }

    public Vehicle get(int index){
        
return parkedVehicles.get(index);
    }

}
