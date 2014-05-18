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
public abstract class AnimalDecorator implements AnimalS{
    
    public AnimalS animal ;
public AnimalDecorator(AnimalS animal) {
this .animal = animal ;
}
    
}
