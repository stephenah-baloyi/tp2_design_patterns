/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.behavioral.stratedy;

import za.ac.cput.rhulani.designpatterns.behavioral.stratedy.Strategy;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class HikeStrategy implements Strategy{
    
    @Override
public boolean checkTemperature(int temperatureInF) {
if ((temperatureInF>= 50) && (temperatureInF<= 90)) {
return true;
} else { return false ;
}
}

    
}
