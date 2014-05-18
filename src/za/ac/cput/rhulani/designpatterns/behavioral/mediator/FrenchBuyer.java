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
public class FrenchBuyer extends Buyer{
    
  public FrenchBuyer(Mediator mediator) {
super(mediator , "euro");
this .mediator.registerFrenchBuyer(this);
}

    
}
