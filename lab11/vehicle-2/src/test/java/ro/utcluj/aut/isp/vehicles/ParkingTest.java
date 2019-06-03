package ro.utcluj.aut.isp.vehicles;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingTest {

    @Test
    public void testParking(){
        Vehicle v1 = new Vehicle("AA", 4);
        Vehicle v2 = new Vehicle("AA", 7);
        Vehicle v3 = new Vehicle("AA", 2);
        Vehicle v4 = new Vehicle("AA", 9);

        Parking p = new Parking();
        p.parkVehicle(v1);p.parkVehicle(v2);p.parkVehicle(v3);p.parkVehicle(v4);

        p.sortByWeight();
        assertEquals(v3, p.get(0));
        assertEquals(v4, p.get(3));
    }
}