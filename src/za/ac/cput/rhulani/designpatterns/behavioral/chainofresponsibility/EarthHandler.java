/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.behavioral.chainofresponsibility;

import za.ac.cput.rhulani.designpatterns.behavioral.chainofresponsibility.PlanetEnum;
import za.ac.cput.rhulani.designpatterns.behavioral.chainofresponsibility.PlanetHandler;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class EarthHandler extends PlanetHandler {
    
public void handleRequest(PlanetEnum request) {
    if (request == PlanetEnum .EARTH) {
        System .out.println("EarthHandler handles " + request);
        System .out.println("Earth is comfortable.\n");
        } 
        else 
        { 
        System .out.println("EarthHandler doesn't handle "+ request);
            if (successor != null) {
            successor .handleRequest(request);
            }
        }
}

    
}
