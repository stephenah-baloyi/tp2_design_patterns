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
public class Person implements EmotionalState
{
EmotionalState emotionalState ;
public Person(EmotionalState emotionalState) {
this .emotionalState = emotionalState ;
}
public void setEmotionalState(EmotionalState emotionalState) {
this .emotionalState = emotionalState ;
}
@Override
public String sayGoodbye() {
return emotionalState .sayGoodbye() ;
}
@Override
public String sayHello() {
return emotionalState .sayHello() ;

}
}
