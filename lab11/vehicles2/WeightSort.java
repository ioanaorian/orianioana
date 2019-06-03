/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.utcluj.aut.isp.vehicles2;

import java.util.Comparator;

/**
 *
 * @author Alexandra
 */
import java.util.*;

public class WeightSort implements Comparator<Vehicle>{

    public int compare(Vehicle one, Vehicle two){
    int returnVal = 0;

    if(one.getWeight() < two.getWeight()){
        returnVal =  -1;
    }else if(one.getWeight() > two.getWeight()){
        returnVal =  1;
    }else if(one.getWeight() == two.getWeight()){
        returnVal =  0;
    }
    return returnVal;
    }
}