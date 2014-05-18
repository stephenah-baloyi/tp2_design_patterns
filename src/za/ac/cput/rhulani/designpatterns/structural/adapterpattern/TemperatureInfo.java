/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.structural.adapterpattern;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public interface TemperatureInfo {
    public double getTemperatureInF () ;
    public void setTemperatureInF(double temperatureInF);
    public double getTemperatureInC () ;
    public void setTemperatureInC(double temperatureInC);

    
}
