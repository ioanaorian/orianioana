package ro.utcluj.aut.isp.vehicles;

import org.junit.Test;

import static org.junit.Assert.*;

public class ElectricVehicleTest {

    @Test
    public void testStart(){
        ElectricVehicle x = new ElectricVehicle("DSCF34", 1100);
        assertEquals("electric engine started", x.start());
    }

}