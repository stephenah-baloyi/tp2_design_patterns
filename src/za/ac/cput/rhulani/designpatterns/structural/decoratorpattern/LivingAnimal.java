/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.structural.decoratorpattern;

import za.ac.cput.rhulani.designpatterns.structural.decoratorpattern.AnimalS;



/**
 *
 * @author Rhulani Steff Baloyi
 */
public class LivingAnimal implements AnimalS{
    
 @Override
public void describe() {
System .out.println("\nI am an animal.");
}

    
}
