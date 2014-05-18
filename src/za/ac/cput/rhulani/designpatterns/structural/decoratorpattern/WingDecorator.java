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
public class WingDecorator extends AnimalDecorator
 {
    
            public WingDecorator(AnimalS animal) {
        super(animal);
        }
        @Override
        public void describe() {
        animal .describe() ;
        System .out.println("I have wings.");
        fly() ;
        }
        public void fly() {
        System .out.println("I can fly .");
        }


}
