/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.behavioral.observer;

import za.ac.cput.rhulani.designpatterns.behavioral.observer.WeatherObserver;
import za.ac.cput.rhulani.designpatterns.behavioral.observer.WeatherSubject;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class WeatherStation implements WeatherSubject
{
            Set<WeatherObserver> weatherObservers ;
        int temperature ;
        public WeatherStation(int temperature) {
        weatherObservers = new HashSet<WeatherObserver>();
        this .temperature = temperature ;
        }
        @Override
        public void addObserver(WeatherObserver weatherObserver) {
        weatherObservers .add(weatherObserver);
        }
        @Override
        public void removeObserver(WeatherObserver weatherObserver) {
        weatherObservers .remove(weatherObserver);
        }
        @Override
        public void doNotify() {
        Iterator<WeatherObserver> it = weatherObservers .iterator() ;
        while (it.hasNext()) {
        WeatherObserver weatherObserver = it.next() ;
        weatherObserver .doUpdate(temperature);
        }
        }
        public void setTemperature(int newTemperature) {
        System .out.println("\nWeather station setting temperature to " + newTemperature);
        temperature = newTemperature ;
        doNotify() ;
        }

}
