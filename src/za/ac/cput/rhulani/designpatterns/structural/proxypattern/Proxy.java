/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.structural.proxypattern;

import za.ac.cput.rhulani.designpatterns.structural.proxypattern.SlowThing;
import java.util.Date;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class Proxy {
    
    SlowThing slowThing ;
    public Proxy() {
    System .out.println("Creating proxy at " + new Date());
    }
    public void sayHello() {
        
    if (slowThing == null) {
        
    slowThing = new SlowThing() ;
    }
    slowThing .sayHello() ;
    }

}
