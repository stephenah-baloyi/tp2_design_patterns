/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.creational.abstractpattern;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class ReptileFactory extends SpeciesFactory{

    @Override
    public Animals getAnimal(String type) {
        if ("snake".equals(type)) {
    return new Snake() ;
        }
        else 
        { 
            return new Tyrannosaurus () ;
        }
     }
}

  
    
