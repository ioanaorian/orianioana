package orian.ioana.lab5.ex3;

public abstract class Sensor {
    private String location;
    public abstract int readValue();
    public String getLocation(){
        return this.location;
    }
}
