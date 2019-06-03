package ro.utcluj.aut.isp.vehicles;

import org.junit.Test;

import static org.junit.Assert.*;

public class ElectricBatteryTest {

    /**
     * Expect battery to throw excaption if charged more than 100%
     */
    @Test(expected = BatteryException.class)
    public void charge() {
        ElectricBattery bat = new ElectricBattery();
        for(int i=0;i<110;i++)
            bat.charge();

    }
}