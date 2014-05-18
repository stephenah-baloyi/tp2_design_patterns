/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.creational.singletonpattern;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class SingletonExample {
    private static SingletonExample singletonExample = null ;
private SingletonExample () {
}
public static SingletonExample getInstance () {
if (singletonExample == null) {
singletonExample = new SingletonExample () ;
}
return singletonExample ;
}
public void sayHello() {    
    System .out.println("Hello");
    }
}

   