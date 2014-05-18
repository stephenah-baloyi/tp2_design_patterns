/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.structural.adapterpattern;

import za.ac.cput.rhulani.designpatterns.structural.adapterpattern.CelciusReporter;
import za.ac.cput.rhulani.designpatterns.structural.adapterpattern.TemperatureInfo;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class TemperatureClassReporter extends CelciusReporter implements TemperatureInfo
{
        @Override
        public double getTemperatureInC () {
        return temperatureInC ;
        }
        @Override
        public double getTemperatureInF () {
        return cToF(temperatureInC);
        }
        @Override
        public void setTemperatureInC(double temperatureInC) {
        this .temperatureInC = temperatureInC ;
        }
        @Override
        public void setTemperatureInF(double temperatureInF) {
        this .temperatureInC = fToC(temperatureInF);
        }
        private double fToC(double f) {
        return ((f - 32) * 5 / 9);
        }
        private double cToF(double c) {
        return ((c * 9 / 5) + 32);
        }   
}
