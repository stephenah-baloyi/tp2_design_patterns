/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.behavioral.observer;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public interface WeatherSubject {
    
    public void addObserver(WeatherObserver weatherObserver);
    public void removeObserver(WeatherObserver weatherObserver);
    public void doNotify() ;

    
}
