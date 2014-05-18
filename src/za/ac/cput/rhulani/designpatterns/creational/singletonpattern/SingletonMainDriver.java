/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.rhulani.designpatterns.creational.singletonpattern;

/**
 *
 * @author Mhumhu
 */
public class SingletonMainDriver {
    
    public static void main(String[] args)
    {
        SingletonExample singletonExample = SingletonExample.getInstance();
        singletonExample.sayHello();
        
    }
    
}
