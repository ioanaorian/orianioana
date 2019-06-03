package ro.utcluj.aut.isp.vehicles;


import java.util.Objects;

public class Vehicle {
    private String type; 
    private int weight;

    public int getWeight(){
    return this.weight;
    }
    
    public Vehicle(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
       
        Vehicle vehicle = (Vehicle) o;
        return weight == vehicle.weight &&
                type.equals(vehicle.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, weight);
    }
    
    public String start(){
        return "engine started";
            
            }
}