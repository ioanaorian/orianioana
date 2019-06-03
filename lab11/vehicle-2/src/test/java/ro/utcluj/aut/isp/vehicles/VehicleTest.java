package ro.utcluj.aut.isp.vehicles;

import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {

    @Test
    public void testCreate(){
        Vehicle v1 = new Vehicle("demo1", 1500);
        Vehicle v2 = new Vehicle("demo1", 1500);
        assertTrue(v1.equals(v2));
    }

    @Test
    public void testStart(){
        Vehicle v1 = new Vehicle("demo1", 1500);
        assertEquals("engine started", v1.start());
    }

}