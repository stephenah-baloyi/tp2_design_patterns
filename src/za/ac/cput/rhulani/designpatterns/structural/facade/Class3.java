/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.structural.facade;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class Class3 {
    
    public int doMoreStuff(Class1 class1 , Class2 class2 , int x) {
return class1 .doSomethingComplicated(x) * class2 .doAnotherThing(class1 , x);
}

    
}
