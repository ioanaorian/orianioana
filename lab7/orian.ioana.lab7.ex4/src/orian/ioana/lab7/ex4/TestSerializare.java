/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab7.ex4;

/**
 *
 * @author Alexandra
 */
public class TestSerializare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        CarFactory f=new CarFactory();
        
        Car a=f.createCar(123,5467);
        Car b=f.createCar(234,6433);
        
        f.freezCar(a, "car.dat");
        f.freezCar(b, "car.dat");
        
        Car x=f.unfreezCar("car.dat");
        Car y=f.unfreezCar("car.dat");
        
        System.out.println(x);
        System.out.println(y);
    }
    
}
