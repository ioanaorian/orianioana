package orian.ioana.lab5.ex3;

public class Controller {

    private TemperatureSensor tempSensor;
    private LightSensor lightSensor;

    public Controller(TemperatureSensor tempSensor, LightSensor lightSensor){
        this.tempSensor = tempSensor;
        this.lightSensor = lightSensor;
    }

    public void control() {
        try{
            System.out.println("Temperature Sensor Value: " + tempSensor.readValue() + " Light Sensor Value: " + lightSensor.readValue());
            Thread.sleep(999, 700);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

}