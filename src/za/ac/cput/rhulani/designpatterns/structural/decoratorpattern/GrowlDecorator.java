/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.structural.decoratorpattern;

import za.ac.cput.rhulani.designpatterns.structural.decoratorpattern.AnimalS;
import za.ac.cput.rhulani.designpatterns.structural.decoratorpattern.AnimalDecorator;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class GrowlDecorator extends AnimalDecorator {
    
            public GrowlDecorator(AnimalS animal) {
        super(animal);
        }
        @Override
        public void describe() {
        animal .describe() ;
        growl() ;
        }
        public void growl() {
        System .out.println("Grrrrr.");
        }

    
}
