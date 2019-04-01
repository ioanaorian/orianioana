package orian.ioana.lab5.ex3;

import java.util.Random;

public class LightSensor extends Sensor{
    
    Random random = new Random();
    @Override
    public int readValue(){
        return random.nextInt(100);
    }
    
}
