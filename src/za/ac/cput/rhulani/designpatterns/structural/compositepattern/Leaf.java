/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.structural.compositepattern;

import za.ac.cput.rhulani.designpatterns.structural.compositepattern.Component;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class Leaf implements Component{
    
         String name ;
         
        public Leaf(String name) {
        this .name = name ;
        }
        @Override
        public void sayHello() {
        System .out.println(name + " leaf says hello");
        }
        @Override
        public void sayGoodbye() {
        System .out.println(name + " leaf says goodbye");
        }

    
}
