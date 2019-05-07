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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static orian.ioana.lab9.ex5.Interface.*;

public class Action implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        if (Interface.trains < 9) {
            if (display.getText() != null)
                display.setText(null);
            String stationN = Interface.station.getText();
            String trainN = Interface.train.getText();
            String destinatie = Interface.destination.getText();
            int segmentId = Integer.parseInt(Interface.segment.getText());
            if (trainN != null) {
                if (stationN != null) {
                    if (destinatie != null) {
                        if (Interface.segment.getText() != null) {
                            t[trains] = new Train(Interface.destination.getText(), Interface.train.getText());
                            if (stationN.equals("Bucuresti") && segmentId >= 1 && segmentId < 4) {
                                Interface.c1.arriveTrain(t[trains], segmentId);
                                c1.controlStep();
                            }
                            if (stationN.equals("Cluj-Napoca") && segmentId >= 4 && segmentId < 7) {
                                c2.arriveTrain(t[trains], segmentId);
                                c2.controlStep();
                            }
                            if (stationN.equals("Iasi") && segmentId >= 7 && segmentId < 10) {
                                c3.arriveTrain(t[trains], segmentId);
                                c3.controlStep();
                            }
                            destination.setText("");
                            segment.setText("");
                            station.setText("");
                            train.setText("");
                        } else display.append("You should write a segment in Segment section\n");
                    } else display.append("Write the destination\n");
                } else display.append("Write the train name\n");
            } else display.append("Station section isn't filled\n");
        } else display.append("Number of trains exceed\n");
        c1.displayStationState();
        c2.displayStationState();
        c3.displayStationState();
    }
}



