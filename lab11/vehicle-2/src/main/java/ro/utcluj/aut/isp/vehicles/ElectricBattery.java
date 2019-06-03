package ro.utcluj.aut.isp.vehicles;

public class ElectricBattery {

    /**
     * Percentage load.
     */
    private int charge = 0;

    public void charge(){
        charge++;
    }
    public int getCharge(){
    return this.charge;
    }

}
