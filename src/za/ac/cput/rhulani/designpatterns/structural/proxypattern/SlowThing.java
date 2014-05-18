/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.structural.proxypattern;

import za.ac.cput.rhulani.designpatterns.structural.proxypattern.Thing;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class SlowThing extends Thing{
    public SlowThing() {
    try {
    Thread .sleep(5000);
    } 
    catch (InterruptedException e) {
        e.printStackTrace () ;
    }
   }
}
