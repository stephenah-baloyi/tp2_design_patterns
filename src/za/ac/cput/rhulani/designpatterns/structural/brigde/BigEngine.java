/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.structural.brigde;

import za.ac.cput.rhulani.designpatterns.structural.brigde.Engine;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class BigEngine implements Engine{
    
        int horsepower ;
    public BigEngine() {
    horsepower = 350;
    }
    @Override
    public int go() {
    System .out.println("The big engine is running");
    return horsepower ;
    }

    
}
