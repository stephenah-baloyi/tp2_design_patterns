/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.behavioral.observer;

import za.ac.cput.rhulani.designpatterns.behavioral.observer.WeatherObserver;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class WeatherCustomer1 implements WeatherObserver
{

        @Override
    public void doUpdate(int temperature) {
    System .out.println("Weather customer 1 just found out the temperature is :"+ temperature);
    }

}
