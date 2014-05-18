/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.structural.adapterpattern;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class CelciusReporter {
    
    public double temperatureInC ;
    public CelciusReporter () {
    }
    public double getTemperature () {
    return temperatureInC ;
    }
    public void setTemperature(double temperatureInC) {
    this .temperatureInC = temperatureInC ;
    }

}
