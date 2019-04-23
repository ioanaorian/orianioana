/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab8.ex3;

/**
 *
 * @author Alexandra
 */
public class Segment {
    public int id;
    private Train train;

    Segment(int id){
        this.id = id;
    }

    public boolean hasTrain(){
        return train!=null;
    }

    public Train departTRain(){
        Train tmp = train;
        this.train = null;
        return tmp;
    }

    void arriveTrain(Train t){
        train = t;
    }

   public  Train getTrain(){
        return train;
    }
}

