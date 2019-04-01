package orian.ioana.lab5.ex4;

public class Controller {
    private static Controller controller = null;
    private TemperatureSensor tempSensor;
    private LightSensor lightSensor;

    public Controller(TemperatureSensor tempSensor, LightSensor lightSensor){
        this.tempSensor = tempSensor;
        this.lightSensor = lightSensor;
    }

    public static Controller getInstance(TemperatureSensor tempSensor, LightSensor lightSensor){
        controller = new Controller(tempSensor,lightSensor);
        return controller;
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