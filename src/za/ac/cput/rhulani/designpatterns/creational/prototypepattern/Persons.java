/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.creational.prototypepattern;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class Persons implements Prototype{
    
    String name ;
    
    public Persons(String name) 
    {
    this .name = name ;
    }


    @Override
    public Prototype doClone() 
        {
        return new Persons(name);
        }
        public String toString() {
            
        return "This person is named " + name ;
    }
    
}
