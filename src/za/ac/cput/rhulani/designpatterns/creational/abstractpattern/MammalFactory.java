/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.creational.abstractpattern;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class MammalFactory extends SpeciesFactory{

    @Override
    public Animals getAnimal(String type) {
      if("dog".equals(type))
      {
          return new Dog();
          
      }
      else {
          return new Cat();
      }
    }
    
}
