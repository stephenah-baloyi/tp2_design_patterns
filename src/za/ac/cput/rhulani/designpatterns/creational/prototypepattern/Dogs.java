/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.creational.prototypepattern;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class Dogs implements Prototype{
            String sound ;
        public Dogs(String sound) {
        this .sound = sound ;
        }
        @Override
        public Prototype doClone() {
        return new Dogs(sound);
        }
        public String toString() {
        return "This dog says " + sound ;
        }

}
