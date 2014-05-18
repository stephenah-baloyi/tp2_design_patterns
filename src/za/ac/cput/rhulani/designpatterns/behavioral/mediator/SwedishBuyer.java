/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.behavioral.mediator;

import za.ac.cput.rhulani.designpatterns.behavioral.mediator.Buyer;
import za.ac.cput.rhulani.designpatterns.behavioral.mediator.Mediator;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class SwedishBuyer extends Buyer {
   
   public SwedishBuyer(Mediator mediator) {
super(mediator , "krona");
this.mediator.registerSwedishBuyer(this);
}

    
}
