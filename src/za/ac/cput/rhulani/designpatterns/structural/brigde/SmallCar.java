/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.structural.brigde;

import za.ac.cput.rhulani.designpatterns.structural.brigde.Engine;
import za.ac.cput.rhulani.designpatterns.structural.brigde.Vehicle;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class SmallCar extends Vehicle{
    
        public SmallCar(Engine engine) {
        this .weightInKilos = 600;
        this .engine = engine ;
        }
        @Override
        public void drive() {
        System .out.println("\nThe small car is driving");
        int horsepower = engine .go() ;
        reportOnSpeed(horsepower);
        }
    
}
