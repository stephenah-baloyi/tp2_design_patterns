/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.behavioral.state;

import za.ac.cput.rhulani.designpatterns.behavioral.state.EmotionalState;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class HappyState implements EmotionalState{
    
        @Override
    public String sayGoodbye() {
    return "Bye, friend !";
    }
    @Override
    public String sayHello() {
    return "Hello , friend !";
    }


}
