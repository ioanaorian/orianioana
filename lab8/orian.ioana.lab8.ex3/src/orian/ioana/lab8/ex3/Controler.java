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
import java.util.ArrayList;
import java.util.List;

public class Controler {
    private String stationName;

    List<Controler> neighbourControllerList = new ArrayList<Controler>();// making an unlimited number of neighbourController
    //storing station train track segments
    ArrayList<Segment> list = new ArrayList<Segment>();

    public Controler(String gara) {
        stationName = gara;
    }

    void setNeighbourController(Controler v){
        neighbourControllerList.add(v);

    }

    void addControlledSegment(Segment s) {
        list.add(s);
    }

    /**
     * Check controlled segments and return the id of the first free segment or -1 in case there is no free segment in this station
     *
     * @return
     */
    int getFreeSegmentId() {
        for (Segment s : list) {
            if (s.hasTrain() == false)
                return s.id;
        }
        return -1;
    }

    void controlStep() {
        //check which train must be sent

        for (Segment segment : list) {
            if (segment.hasTrain()) {
                Train t = segment.getTrain();
               for(Controler neighbourControler:neighbourControllerList )
                if (t.getDestination().equals(neighbourControler.stationName)) {

                    int id = neighbourControler.getFreeSegmentId();//id gets the next station/segment
                    if (id == -1) { //check if there is a free segment
                        System.out.println("Trenul +" + t.getName() + "din gara " + stationName + " nu poate fi trimis catre " + neighbourControler.stationName + ". Nici un segment disponibil!");
                        return;
                    }
                    //send train
                    System.out.println("Trenul " + t.getName() + " pleaca din gara " + stationName + " spre gara " + neighbourControler.stationName);
                    segment.departTRain();//elibereaza segmentul, pentru ca trenul poate pleca
                    neighbourControler.arriveTrain(t, id);
                }

            }
        }//.for

    }//.


    public void arriveTrain(Train t, int idSegment) {
        for (Segment segment : list) {
            //search id segment and add train on it
            if (segment.id == idSegment)
                if (segment.hasTrain() == true) {
                    System.out.println("CRASH! Train " + t.getName() + " colided with " + segment.getTrain().getName() + " on segment " + segment.id + " in station " + stationName);
                    return;
                } else {
                    System.out.println("Train " + t.getName() + " arrived on segment " + segment.id + " in station " + stationName);
                    segment.arriveTrain(t);
                    return;
                }
        }

        //this should not happen
        System.out.println("Train " + t.getName() + " cannot be received " + stationName + ". Check controller logic algorithm!");

    }


    public void displayStationState() {
        System.out.println("=== STATION " + stationName + " ===");
        for (Segment s : list) {
            if (s.hasTrain())
                System.out.println("|----------ID=" + s.id + "__Train=" + s.getTrain().getName() + " to " + s.getTrain().getDestination() + "__----------|");
            else
                System.out.println("|----------ID=" + s.id + "__Train=______ catre ________----------|");
        }
    }
}
