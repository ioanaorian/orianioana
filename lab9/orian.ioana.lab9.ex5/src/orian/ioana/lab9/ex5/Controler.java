/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab9.ex5;

/**
 *
 * @author Alexandra
 */
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Controler {
    String stationName;
    List<Controler> neighbourController=new ArrayList<Controler>();

    //storing station train track segments
    ArrayList<Segment> list = new ArrayList<Segment>();

    public Controler(String gara) {
        stationName = gara;
    }

    void setNeighbourController(Controler v){
        neighbourController.add(v);
    }

    void addControlledSegment(Segment s){
        list.add(s);
    }

    /**
     * Check controlled segments and return the id of the first free segment or -1 in case there is no free segment in this station
     *
     * @return
     */
    int getFreeSegmentId(){
        for(Segment s:list){
            if(s.hasTrain()==false)
                return s.id;
        }
        return -1;
    }

    void controlStep(){
        //check which train must be sent

        for(Segment segment:list){
            if(segment.hasTrain()){
                Train t = segment.getTrain();
             for(Controler contr:neighbourController)
                if(t.getDestination().equals(contr.stationName)){
                    //check if there is a free segment
                    int id = contr.getFreeSegmentId();
                    if(id==-1){
                        Interface.show("Trenul +"+t.name+"din gara "+stationName+" nu poate fi trimis catre "+contr.stationName+". Nici un segment disponibil!");
                        return;
                    }
                    //send train
                    Interface.show("Trenul "+t.name+" pleaca din gara "+stationName +" spre gara "+contr.stationName);
                    segment.departTRain();
                    contr.arriveTrain(t,id);
                }

            }
        }//.for

    }//.


    public void arriveTrain(Train t, int idSegment){
        for(Segment segment:list){
            //search id segment and add train on it
            if(segment.id == idSegment)
                if(segment.hasTrain()==true){
                    Interface.show("CRASH! Train "+t.name+" colided with "+segment.getTrain().name+" on segment "+segment.id+" in station "+stationName);
                    return;
                }else{
                    Interface.show( "Train "+t.name+" arrived on segment "+segment.id+" in station "+stationName);
                    segment.arriveTrain(t);
                    return;
                }
        }

        //this should not happen
        Interface.show("Train "+t.name+" cannot be received "+stationName+". Check controller logic algorithm!");

    }


    public void displayStationState(){
        Interface.show("=== STATION "+stationName+" ===");
        for(Segment s:list){
            if(s.hasTrain())
                Interface.show("|----------ID="+s.id+"__Train="+s.getTrain().name+" to "+s.getTrain().destination+"__----------|");
            else
                Interface.show("|----------ID="+s.id+"__Train=______ catre ________----------|");
        }
    }
}

