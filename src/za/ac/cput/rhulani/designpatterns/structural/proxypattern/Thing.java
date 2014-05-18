/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.structural.proxypattern;

import java.util.Date;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public abstract class Thing {
    public void sayHello() {
System .out.println(this .getClass() .getSimpleName () + "says howdy at " + new Date());
}

    
}
